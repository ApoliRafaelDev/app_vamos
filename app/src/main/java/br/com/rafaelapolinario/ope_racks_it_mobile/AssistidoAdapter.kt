package br.com.rafaelapolinario.ope_racks_it_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class AssistidoAdapter(
    val assistidos: List<Assistido>,
    val onClick: (Assistido) -> Unit
) : RecyclerView.Adapter<AssistidoAdapter.AssistidoViewHolder>(){
    class AssistidoViewHolder(view: View): RecyclerView.ViewHolder(view){
        val cardNome: TextView
        val cardImg: ImageView
        val cardProgress: ProgressBar

        init {
            cardNome = view.findViewById(R.id.cardNome)
            cardImg = view.findViewById(R.id.cardImg)
            cardProgress = view.findViewById(R.id.cardProgress)
        }
    }

    override fun getItemCount() = this.assistidos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AssistidoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_assistido, parent, false)

        val holder = AssistidoViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: AssistidoViewHolder, indice: Int){
        val assistido = this.assistidos[indice]

        holder.cardNome.text = assistido.nome
        holder.cardProgress.visibility = View.VISIBLE
        Picasso.with(holder.itemView.context).load(assistido.foto).fit().into(holder.cardImg,
            object: com.squareup.picasso.Callback{
                override fun onSuccess() {
                    holder.cardProgress.visibility = View.GONE
                }

                override fun onError() {
                    holder.cardProgress.visibility = View.GONE
                }
            })
        holder.itemView.setOnClickListener{onClick(assistido)}
    }
}