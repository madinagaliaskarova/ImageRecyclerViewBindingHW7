package com.geektech.imagerecyclerviewbindinghw7

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.imagerecyclerviewbindinghw7.databinding.ItemImageBinding

class ImageAdapter(private val data: ArrayList<ImageModel>) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(data.get(position))
    }


    override fun getItemCount(): Int {
        return data.size
    }

    inner class ImageViewHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imageModel: ImageModel) {
            binding.textView.text = imageModel.textTitle
            Glide.with(binding.imageView).load(imageModel.image).into(binding.imageView)

            imageModel.backColor?.let { itemView.context.getColor(it) }
                ?.let { binding.parent.setBackgroundColor(it) }

            imageModel.bottomColor?.let { itemView.context.getColor(it) }
                ?.let { binding.textView.setBackgroundColor(it) }
        }

    }
}

