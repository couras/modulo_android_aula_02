package code200dev.com.appaula01_cotacao

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView

import kotlinx.android.synthetic.main.activity_act_detail_garotas.*

class actDetailGarotas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_detail_garotas)
        setSupportActionBar(toolbar)

        val intent = intent

        if(intent != null) {
            val garota = intent.getSerializableExtra("garota") as Harvester

            if(garota != null) {
                garota.image?.let {
                    imgDetail.setImageResource(it)
                }

                this.title = "Detalhes da " + garota.nome

                nomeDetail.text = garota.nome
                descricaoDetail.text = garota.description
                idadeDetail.text = "Idade: " + garota.idade.toString()
                pesoDetail.text = "Peso: " + garota.peso.toString()
            }
        }
    }

}
