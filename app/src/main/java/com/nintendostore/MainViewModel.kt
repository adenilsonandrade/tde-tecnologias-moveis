package com.nintendostore

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val listaDeConsoles = mutableListOf(
        Console(
            urlImage = "https://i.pinimg.com/564x/4f/ac/6c/4fac6ce13eac0b5a00d85528e2b0f18e.jpg",
            name = "Super Nintendo",
            launch = "1990",
            price = "68.00",
            description = "Super Nintendo",
            console = "superNintendo"
        ),
        Console(
            urlImage = "https://i.pinimg.com/564x/a8/0e/84/a80e84a8f29254832658cdf4e0a3a5c2.jpg",
            name = "PlayStantion",
            launch = "1994",
            price = "99.00",
            description = "Playstation",
            console = "playstation"
        )
    )

    fun getConsoles() = listaDeConsoles
}