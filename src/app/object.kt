package app

import data.Car
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

    val toyota = Car("Toyota")
    var almaz = Car("Almaz", 2019)

    println(toyota.brand)
    println(toyota.year)

    println(almaz.brand)
}