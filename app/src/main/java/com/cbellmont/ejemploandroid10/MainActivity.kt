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

        createRecyclerView(list)
    }

    private fun createRecyclerView(values: List<String>) {
        // Aquií le decimos que ponga los elemento de arriba a abajo.
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = StringAdapter(values)
    }
}