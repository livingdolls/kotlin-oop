package app

import data.Product

fun main() {
    val product = Product("Indomie", 5_000, "Makanan")
    println(product)

    val product2 = product.copy(name = "Super Mie")
    println(product2)
}