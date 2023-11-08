package com.example.google_play_store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val appCategories = listOf("Game", "Giải trí", "Thông tin", "Mua sắm", "Sức khỏe", "Tài chính", "Liên lạc", "Sản xuất", "Công cụ")

        val items = arrayListOf<GroupModel>()
        val list = ArrayList<ItemModel>()
        list.add(ItemModel("Facebook", resources.getIdentifier("facebook", "drawable", packageName), 4.0f));
        list.add(ItemModel("Instagram", resources.getIdentifier("instagram", "drawable", packageName), 4.2f));
        list.add(ItemModel("TikTok", resources.getIdentifier("tiktok", "drawable", packageName), 3.8f));
        list.add(ItemModel("Twitter", resources.getIdentifier("twitter", "drawable", packageName), 4.6f));
        list.add(ItemModel("Youtube", resources.getIdentifier("youtube", "drawable", packageName), 4.8f));
        list.add(ItemModel("Google Maps", resources.getIdentifier("google_maps", "drawable", packageName), 3.5f));
        list.add(ItemModel("Google Play", resources.getIdentifier("google_play", "drawable", packageName), 4.9f));
        list.add(ItemModel("Google Chrome", resources.getIdentifier("google_chrome", "drawable", packageName), 4.3f));
        list.add(ItemModel("Google Drive", resources.getIdentifier("google_drive", "drawable", packageName), 5.0f));
        repeat(9) {
            val index = it + 1
            val name = appCategories[it]
            items.add(GroupModel(name, list))
        }


        val adapter = RVGroupAdapter(items)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = adapter
    }
}