package code200dev.com.appaula01_cotacao

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        btnDollar.setOnClickListener {

            this.converterValor(txtValor.text.toString(), btnDollar.text.toString().toLowerCase(), btnDollar.tag.toString())
        }

        btnEuro.setOnClickListener {

            this.converterValor(txtValor.text.toString(), btnEuro.text.toString().toLowerCase(), btnEuro.tag.toString())
        }

        btnLibras.setOnClickListener {

            this.converterValor(txtValor.text.toString(), btnLibras.text.toString().toLowerCase(), btnLibras.tag.toString())
        }

        btnPesoArgentino.setOnClickListener {

            this.converterValor(txtValor.text.toString(), btnPesoArgentino.text.toString().toLowerCase(), btnPesoArgentino.tag.toString())
        }

        btnTeste.setOnClickListener {
            val intent = Intent(this@MainActivity, actPlacar::class.java)
            startActivity(intent)
        }

        btnListaBasica.setOnClickListener{
            val intent = Intent(this@MainActivity, actListaBasica::class.java)
            startActivity(intent)
        }

        btnListaCustomizada.setOnClickListener {
            val intent = Intent(this@MainActivity, actListaCustomizada::class.java)
            startActivity(intent)
        }

        btnMinhaLista.setOnClickListener{
            val intent = Intent(this@MainActivity, actListaGarotas::class.java)
            startActivity(intent)
        }
    }

    fun onClick(v: View) {
        val intent = Intent(this@MainActivity, actPlacar::class.java)
        startActivity(intent)
    }

    fun converterValor(valor:String, tipo: String, unidade: String){

        if(valor.isNullOrEmpty()) {
            longToast("digite alguma coisa imbecil")
            return
        }

       val vl = when(tipo) {
           "dollar" -> 4.00
           "euro" -> 4.50
           "peso argentino" ->  0.10
           "libra" -> 4.91
           else -> 0.0
       } * valor.toDouble()

        val intent = Intent(this@MainActivity, TelaResultado::class.java)
        intent.putExtra("resultado", unidade + " " + "%.2f".format(vl))
        startActivity(intent)
//        txtResultado.setText(unidade + " " + "%.2f".format(vl))

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
