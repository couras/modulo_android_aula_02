package code200dev.com.appaula01_cotacao

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_act_lista_garotas.*
import kotlinx.android.synthetic.main.content_act_lista_garotas.*

class actListaGarotas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_lista_garotas)
        setSupportActionBar(toolbar)

        val listaGarotas = ArrayList<Harvester>()
        val gp1 = Harvester(1L, "Carla", 21, 51.0, "Loira, seios fartos, cinturinha, olhos verdes", R.drawable.loira)
        val gp2 = Harvester(2L, "Michele", 25, 56.0, "Ruiva, seios fartos, cinturinha, olhos verdes" , R.drawable.ruiva)
        val gp3 = Harvester(3L, "Carolzinha", 18, 61.0, "Morena, seios fartos, cinturinha, olhos verdes", R.drawable.morena)

        listaGarotas.add(gp1)
        listaGarotas.add(gp2)
        listaGarotas.add(gp3)

        val adapter = HarvesterAdapter(applicationContext, listaGarotas)

        val lista = findViewById<ListView>(R.id.lstGarotas)
        lstGarotas.setAdapter(adapter)

        lista.setOnItemClickListener {parent, view, position, id ->
            val garota = listaGarotas.get(position)
            val intent = Intent(this, actDetailGarotas::class.java)
            intent.putExtra("garota", garota)
            startActivity(intent)
        }

    }

}
