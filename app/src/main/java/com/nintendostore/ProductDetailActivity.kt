package com.nintendostore

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class ProductDetailActivity : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productBundle = intent.getSerializableExtra("data") as? Product

        val name = findViewById<TextView>(R.id.tvProductName)
        val gender = findViewById<TextView>(R.id.tvProductGender)
        val launch = findViewById<TextView>(R.id.tvProductLaunch)
        val price = findViewById<TextView>(R.id.tvProductPrice)
        val description = findViewById<TextView>(R.id.tvProductDescription)
        val image = findViewById<ImageView>(R.id.tvImageProduct)

        Glide
            .with(this)
            .load(productBundle?.urlImage)
            .centerCrop()
            .into(image)

        name.text = productBundle?.name
        gender.text = productBundle?.gender
        launch.text = productBundle?.launch
        price.text = productBundle?.price
        description.text = productBundle?.description
    }
}