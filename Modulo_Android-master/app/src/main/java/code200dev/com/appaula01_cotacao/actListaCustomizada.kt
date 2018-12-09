package code200dev.com.appaula01_cotacao

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_act_lista_customizada.*

class actListaCustomizada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_lista_customizada)

        val listaContatos = ArrayList<Contato>()
        val c1 = Contato(1L, "Mito", "color@br.com", "Alagoas", R.mipmap.mito)
        val c2 = Contato(2L, "Dilma", "dilma@br.com", "Porto Alegre", R.mipmap.dilma)
        val c3 = Contato(2L, "Lula tah preso babaca", "lulinha@br.com", "Cadeia")

        listaContatos.add(c1)
        listaContatos.add(c2)
        listaContatos.add(c3)

        val adapter = ContatoAdapter(applicationContext, listaContatos)

        val lista = findViewById<ListView>(R.id.lstCustomizada)
        lstCustomizada.setAdapter(adapter)
    }

}
