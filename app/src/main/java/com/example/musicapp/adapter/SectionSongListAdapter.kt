package com.example.musicapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.musicapp.MyExoplayer
import com.example.musicapp.PlayerActivity
import com.example.musicapp.databinding.SectionSongListRecyclerRowBinding
import com.example.musicapp.databinding.SongListItemRecyclerRowBinding
import com.example.musicapp.models.SongModel
import com.google.firebase.firestore.FirebaseFirestore


class SectionSongListAdapter (private val songIdList: List<String>): RecyclerView.Adapter<SectionSongListAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: SectionSongListRecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {


        //bind data to the views
        fun bindData(songID: String) {

            FirebaseFirestore.getInstance().collection("songs")
                .document(songID).get().addOnSuccessListener {

                    val song = it.toObject(SongModel::class.java)
                    song?.apply {

                        binding.songTitleTextView.text = title
                        binding.songSubtitleTextView.text = subtitle
                        Glide.with(binding.songCoverImageView)
                            .load(coverUrl)
                            .transform(RoundedCorners(32))
                            .into(binding.songCoverImageView)

                        binding.root.setOnClickListener {

                            MyExoplayer.startPlaying(binding.root.context,song)
                            it.context.startActivity(Intent(it.context, PlayerActivity::class.java))



                        }


                    }

                }


        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = SectionSongListRecyclerRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return songIdList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(songIdList[position])
    }

}




