package com.geektech.imagerecyclerviewbindinghw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.imagerecyclerviewbindinghw7.databinding.FragmentImageBinding

class ImageFragment : Fragment() {
    private lateinit var binding: FragmentImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding= FragmentImageBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root
    }
}