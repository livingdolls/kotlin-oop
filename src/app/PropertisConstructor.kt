package app

import data.User

fun main() {
    val user1 = User("Nanang", "Hirate")
    val user2 = User("Yurina", "Setiawan")

    user1.userName = "Yurina Hirate"

    println(user1.userName)
    println(user2.userName)

    println(user1.password)
    println(user2.password)
}