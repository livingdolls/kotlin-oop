package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any) {
    if(any is Laptop) {
        println("Laptop: ${any.name}")
    } else if(any is HandPhone) {
        println("HandPhone: ${any.name}")
    }
    else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop: ${any.name}")
        is HandPhone -> println("HandPhone: ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Yurina")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Samsung 10"))

    printObjectWithWhen("Yurina")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung 10"))

    printString("Yurina")
    printString(1)
}