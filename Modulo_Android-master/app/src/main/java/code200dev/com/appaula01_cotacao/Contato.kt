package code200dev.com.appaula01_cotacao

import java.io.Serializable

data class Contato(var id: Long,
                   var nome: String,
                   val email: String? = null,
                   val endereco: String? = null,
                   val imagem: Int? = R.mipmap.error ) : Serializable
