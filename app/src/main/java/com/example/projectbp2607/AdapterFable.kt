package com.example.projectbp2607

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFable (private  val listFable:List<FableModel>):
    RecyclerView.Adapter<AdapterFable.ViewHolder>(){
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val image: ImageView = itemView.findViewById(R.id.imageCover)
        val title: TextView = itemView.findViewById(R.id.textViewJudul)
        val desc: TextView = itemView.findViewById(R.id.textViewIsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFable.ViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_fable,parent,false)
        return AdapterFable.ViewHolder(View)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelFabel = listFable[position]

        holder.image.setImageResource(modelFabel.image)
        holder.title.text = modelFabel.title
        holder.desc.text = modelFabel.desc
    }


    override fun getItemCount(): Int {
        return listFable.size
    }
}