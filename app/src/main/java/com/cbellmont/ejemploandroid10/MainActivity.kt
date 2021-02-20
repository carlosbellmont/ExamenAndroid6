package com.cbellmont.ejemploandroid10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbellmont.ejemploandroid10.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = MutableList(100) { pos -> "Elemento $pos"}

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = StringAdapter(list)
        recyclerView.adapter = adapter

        binding.bImpares.setOnClickListener {
            adapter.stringList = adapter.stringList.filterIndexed { index: Int, s: String -> index % 2 == 1 }
        }

        binding.bPares.setOnClickListener {
            adapter.stringList = adapter.stringList.filterIndexed { index: Int, s: String -> index % 2 == 0 }
        }
    }


}