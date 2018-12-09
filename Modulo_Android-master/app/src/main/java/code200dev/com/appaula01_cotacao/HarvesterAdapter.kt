package code200dev.com.appaula01_cotacao

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class HarvesterAdapter(context: Context, lista: ArrayList<Harvester>) : BaseAdapter() {

    private var listaHarvester: ArrayList<Harvester>
    private var inflator: LayoutInflater

    init {
        this.listaHarvester = lista
        this.inflator = LayoutInflater.from(context)
    }

    override fun getItem(p0: Int): Any {
        return this.listaHarvester.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return this.listaHarvester.get(p0).id;
    }

    override fun getCount(): Int {
        return this.listaHarvester.size
    }

    override fun getView(p0: Int, p1: View?, parent: ViewGroup?): View {
        val garota = this.listaHarvester.get(p0)
        val view = this.inflator.inflate(R.layout.lista_harvester, parent, false)
        (view.findViewById<TextView>(R.id.title)).text = garota.nome
        (view.findViewById<TextView>(R.id.descricao)).text = garota.description?.substring(0,30)
        (view.findViewById<TextView>(R.id.idade)).text = "Idade: " + garota.idade.toString()
        (view.findViewById<TextView>(R.id.peso)).text = "Peso: " + garota.peso.toString()

        garota.image?.let {
            (view.findViewById<ImageView>(R.id.img)).setImageResource(it)
        }

        return view
    }

}