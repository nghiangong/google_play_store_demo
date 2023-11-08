package com.example.google_play_store

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVItemAdapter(val items: ArrayList<ItemModel>): RecyclerView.Adapter<RVItemAdapter.RVItemHolder>() {
    class RVItemHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        val textName: TextView
        val textRating: TextView
        val imageIcon: ImageView
        init {
            textName = itemView.findViewById(R.id.app_name)
            textRating = itemView.findViewById(R.id.app_rating)
            imageIcon = itemView.findViewById(R.id.app_icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVItemHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)
        return RVItemHolder(itemView)
    }
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RVItemHolder, position: Int) {
        holder.textName.text = items[position].nameApp
        holder.textRating.text = items[position].ratingApp.toString()
        holder.imageIcon.setImageResource(items[position].imageThumbApp)
    }
}