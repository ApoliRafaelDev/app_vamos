package br.com.rafaelapolinario.ope_racks_it_mobile

import java.io.Serializable

class Assistido: Serializable {

    var id: Long = 0
    var nome = ""
    var idade = ""
    var projeto = ""
    var foto = ""

    override fun toString() : String {
        return "Assistido (nome=$nome)"
    }
}

