package com.geektech.imagerecyclerviewbindinghw7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.imagerecyclerviewbindinghw7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_fragment, ImageFragment()).commit()
    }
}