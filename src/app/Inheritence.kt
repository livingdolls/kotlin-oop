package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Yurina")
    manager.sayHello("Hirate")

    val vicePresident = VicePresident("Hirate")
    vicePresident.sayHello("Nanang")
}