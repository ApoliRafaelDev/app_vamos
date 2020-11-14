package br.com.rafaelapolinario.ope_racks_it_mobile

object AssistidoService {

    fun getAssistido ():List<Assistido>{
        val assistidos = mutableListOf<Assistido>()
        for (i in 1..10){
            val a = Assistido()
            a.nome = "Assistido $i"
            a.idade = "Idade $i"
            a.projeto = "Projeto $i"
            a.foto = "https://i.imgur.com/KHu8SpP.png"

            assistidos.add(a)
        }
        return assistidos
    }

}