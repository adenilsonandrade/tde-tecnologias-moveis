package com.nintendostore

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.mainRecycler)

        val listOfConsoles = mainViewModel.getConsoles()

        val adapter = MainAdapter(listOfConsoles) {
            goToDetail(it)
        }

        recycler.adapter = adapter
    }

    private fun goToDetail(item: Console) {
        Intent(this, ProductListActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }
}