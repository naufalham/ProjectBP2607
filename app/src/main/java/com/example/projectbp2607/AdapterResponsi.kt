package com.example.projectbp2607

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterResponsi(private val listFasilitas:List<Fasilitas>):
    RecyclerView.Adapter<AdapterResponsi.ViewHolder>() {

    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){

        val image: ImageView = itemView.findViewById(R.id.foto)
        val title: TextView = itemView.findViewById(R.id.textViewJudul)
        val desc1: TextView = itemView.findViewById(R.id.textViewIsi)
        val desc2: TextView = itemView.findViewById(R.id.textViewIsi2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResponsi.ViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_responsi,parent,false)
        return AdapterResponsi.ViewHolder(View)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelFasilitas = listFasilitas[position]

        holder.image.setImageResource(modelFasilitas.image)
        holder.title.text = modelFasilitas.title
        holder.desc1.text = modelFasilitas.desc1
        holder.desc2.text = modelFasilitas.desc2
    }


    override fun getItemCount(): Int {
        return listFasilitas.size
    }
}