package app

import data.Person

fun main() {
    val yurina = Person()

    yurina.firstName = "Yurina"
    yurina.middleName = "Nanang"
    yurina.lastName = "Hirate"

    yurina.sayHello("Nanang")
    yurina.run()

    val fullName = yurina.getFullName()

    println(fullName)
}