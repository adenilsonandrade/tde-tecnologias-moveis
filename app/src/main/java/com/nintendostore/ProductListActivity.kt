package com.nintendostore

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class ProductListActivity : AppCompatActivity() {
    private val productViewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        val listOfProducts = productViewModel.getProducts()

        val adapter = ProductAdapter(listOfProducts) {
            goToDetail(it)
        }

        recycler.adapter = adapter

    }

    private fun goToDetail(item: Product) {
        Intent(this, ProductDetailActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }
}