package com.dreamcode.listview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dreamcode.listview.R
import com.dreamcode.listview.model.ProgrammingLanguage

class ListProgrammingLanguageAdapter(private val listProgrammingLanguage: ArrayList<ProgrammingLanguage>) : RecyclerView.Adapter<ListProgrammingLanguageAdapter.ProgrammingLanguageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingLanguageViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_programminglanguage, parent, false)
        return ProgrammingLanguageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProgrammingLanguage.size
    }

    override fun onBindViewHolder(holder: ProgrammingLanguageViewHolder, position: Int) {
        val programminglanguage = listProgrammingLanguage[position]
        holder.tvName.text = programminglanguage.name
        holder.tvDetail.text = programminglanguage.detail
        Glide.with(holder.itemView.context)
            .load(programminglanguage.poster)
            .into(holder.imgPoster)
    }

    inner class ProgrammingLanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}