package com.nintendostore

import java.io.Serializable

data class Product(
    val urlImage: String,
    val name: String,
    val gender: String,
    val launch: String,
    val price: String,
    val description: String,
    val console: String
) : Serializable