package app

import data.Person

fun main() {
    val yurina = Person()
    yurina.firstName = "Yurina"

    yurina.sayHello("Yurina")
    yurina.sayHello("Nanang", "Yurina")
}