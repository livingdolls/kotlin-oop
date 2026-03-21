package app

import data.Person

fun main() {
    val yurina = Person()

    yurina.firstName = "Nanang"
    yurina.middleName = "Yurina"
    yurina.lastName = "Hirate"

    val nanang = Person()
    nanang.firstName = "Yurina"

    println(nanang.firstName)
    println(yurina.firstName)
}