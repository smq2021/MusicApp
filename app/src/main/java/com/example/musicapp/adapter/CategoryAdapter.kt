package com.example.musicapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.musicapp.SongsListActivity
import com.example.musicapp.databinding.CategoryItemRecyclerRowBinding
import com.example.musicapp.models.CategoryModel


class CategoryAdapter (private val categoryList: List<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.MyviewHolder>() {

    class MyviewHolder(private val binding: CategoryItemRecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bindData(category: CategoryModel) {
                binding.nameTextView.text = category.name
                Glide.with(binding.coverImageView)
                        .load(category.coverUrl)
                        .transform(RoundedCorners(32))
                        .into(binding.coverImageView)


                //Start songlist Activity
                val context = binding.root.context
                binding.root.setOnClickListener{
                    SongsListActivity.category= category
                    context.startActivity(Intent(context, SongsListActivity::class.java))
                }


            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val binding = CategoryItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyviewHolder(binding)
    }

    override fun getItemCount(): Int {
       return categoryList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.bindData(categoryList[position])
    }
    //bind the data with view later

}
