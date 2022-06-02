package com.geektech.imagerecyclerviewbindinghw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.imagerecyclerviewbindinghw7.databinding.FragmentImageBinding

class ImageFragment : Fragment() {

    private lateinit var binding: FragmentImageBinding
    private val data = mutableListOf<ImageModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding= FragmentImageBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = ImageAdapter(data as ArrayList<ImageModel>)
        binding.recyclerView.adapter = adapter
    }

    private fun loadData() {
        data.apply {
            add(ImageModel(R.color.mint, R.color.green,"Food & Drink", "https://cdn-icons-png.flaticon.com/512/2570/2570548.png"))
            add(ImageModel(R.color.yellow, R.color.dark_yellow, "General Knowledge", "https://cdn-icons-png.flaticon.com/128/167/167755.png"))
            add(ImageModel(R.color.blue, R.color.dark_blue, "History", "https://cdn-icons-png.flaticon.com/512/7519/7519411.png"))
            add(ImageModel(R.color.pink, R.color.red, "Geography", "https://www.pngmart.com/files/7/Geography-PNG-Transparent.png"))
            add(ImageModel(R.color.violet, R.color.dark_violet, "Dances", "https://cdn-icons-png.flaticon.com/128/7543/7543835.png"))
            add(ImageModel(R.color.peach, R.color.dark_peach, "Football", "https://www.pngmart.com/files/1/Football-Ball-PNG.png"))
            add(ImageModel(R.color.gray , R.color.dark_gray, "Music", "https://cdn-icons-png.flaticon.com/128/2907/2907253.png"))
            add(ImageModel(R.color.mint, R.color.green, "Cinema", "https://www.pngmart.com/files/22/Finding-Dory-PNG-Isolated-HD-Pictures.png"))
            add(ImageModel(R.color.yellow, R.color.dark_yellow, "Playlist", "https://cdn-icons-png.flaticon.com/128/2394/2394866.png"))
            add(ImageModel(R.color.blue, R.color.dark_blue, "Messages", "https://cdn-icons-png.flaticon.com/128/1041/1041916.png"))

        }
    }

}