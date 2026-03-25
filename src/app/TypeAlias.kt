package app

import data.Application

typealias App = Application
typealias Aplikasi = App

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Yurina Aplikasi")
    val aplikasi = Aplikasi("Yurina")
}