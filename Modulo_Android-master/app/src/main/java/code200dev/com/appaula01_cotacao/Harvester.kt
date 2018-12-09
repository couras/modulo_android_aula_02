package code200dev.com.appaula01_cotacao

import java.io.Serializable

data class Harvester(var id: Long,
                   var nome: String,
                     val idade: Int,
                     val peso: Double,
                   val description: String? = null,
                   val image: Int? = R.mipmap.error ) : Serializable