package com.example.musicapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.musicapp.adapter.SongsListAdapter
import com.example.musicapp.databinding.ActivitySongsListBinding
import com.example.musicapp.models.CategoryModel

class SongsListActivity : AppCompatActivity() {


    //special class in kotlin which allows to create properties to the class itself without creating an object
    companion object {
        lateinit var category: CategoryModel


    }

    lateinit var binding: ActivitySongsListBinding
    lateinit var songsListAdapter: SongsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongsListBinding.inflate(layoutInflater)
        enableEdgeToEdge()


        setContentView(binding.root)
        binding.nameTextView.text = category.name
        binding.nameTextView.text = category.name
        Glide.with(binding.coverImageView)
            .load(category.coverUrl)
            .transform(RoundedCorners(32))
            .into(binding.coverImageView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupSongsListRecyclerView()
    }

    fun setupSongsListRecyclerView() {

        songsListAdapter = SongsListAdapter(category.songs)
        binding.songsListRecyclerView.layoutManager= LinearLayoutManager(this)
        binding.songsListRecyclerView.adapter = songsListAdapter


    }



}