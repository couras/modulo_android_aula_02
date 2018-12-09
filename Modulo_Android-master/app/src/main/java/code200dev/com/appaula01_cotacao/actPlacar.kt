package code200dev.com.appaula01_cotacao

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_act_placar.*
import kotlinx.android.synthetic.main.content_act_placar.*

class actPlacar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_placar)
        setSupportActionBar(toolbar)

        var totalTime1 = 0
        var totalTime2 = 0

        bandeiratime1.setOnClickListener {
            var placar = placar1.text.toString().toInt()
            placar++
            totalTime1 = placar
            ganhador(totalTime1, totalTime2)
            placar1.text =placar.toString()
        }

        bandeiratime2.setOnClickListener {
            var placar = placar2.text.toString().toInt()
            placar++
            totalTime2 = placar
            ganhador(totalTime1, totalTime2)
            placar2.text =placar.toString()
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun ganhador(totalTime1:Int, totalTime2:Int) {
        if (totalTime1 > 0 || totalTime2 > 0) {
            if (totalTime1 > totalTime2) {
                resultado.text = "Vencedor: " + time1.text
            } else if(totalTime2 > totalTime1) {
                resultado.text = "Ganhador: " + time2.text
            } else {
                resultado.text = "Empate"
            }
        }
    }
}
