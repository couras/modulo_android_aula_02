package code200dev.com.appaula01_cotacao

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_tela_resultado.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_tela_resultado.*

class TelaResultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val intent = intent

        if(intent != null) {
            val result = intent.getStringExtra("resultado")
            txtResultadoTela.setText(result)
        }

        btnGoBack.setOnClickListener{
            val intent = Intent(this@TelaResultado, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
