package app

import data.Game
import data.Login
import data.Minmax

fun minmax(value1: Int, value2: Int) : Minmax {
    return when {
        value1 > value2 -> Minmax(value2, value2)
        else -> Minmax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main () {
    val game = Game("Elden Ring", 5000)

    val (name, price) = game

    println("$name, $price")

    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = Login("Nanang", "Yurina")
    login(login) { login ->
        login.username == "nanang" && login.password == "Yurina"
    }

    login(login){ (username, password) ->
        username == "nanang" && password == "Yurina"
    }
}