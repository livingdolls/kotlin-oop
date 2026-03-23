package app

import data.Rectangle

fun main() {
    val rectangle = Rectangle()

    println("Corner = ${rectangle.corner}")
    println("Rectangle = ${rectangle.parentCorner}")

    rectangle.printName()
}