package com.example.google_play_store;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList;

public class RVGroupAdapter(val items: ArrayList<GroupModel>): RecyclerView.Adapter<RVGroupAdapter.RVGroupViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVGroupViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_group, parent, false)

        return RVGroupViewHolder(itemView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RVGroupViewHolder, position: Int) {
        val list = items[position].appList
        val adapter = RVItemAdapter(list)
        holder.name.text = items[position].caption
        holder.list.adapter = adapter
        holder.list.layoutManager = LinearLayoutManager(holder.list.context, LinearLayoutManager.HORIZONTAL, false)
    }

    class RVGroupViewHolder (val itemView: View): RecyclerView.ViewHolder(itemView){
        val name: TextView
        val list: RecyclerView
        init {
            name = itemView.findViewById(R.id.app_name)
            list = itemView.findViewById(R.id.recycler_view)
        }

    }

}
