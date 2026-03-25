package app

import data.Application
import data.Ultilities

fun main() {
    println(Ultilities.toUpper("Yurina"))
    a()
    b()

    println(Application.Ultilities.toUpper("Hirate"))

    println(Application.toUpper("hirate yurina"))
}

fun a() {
    println(Ultilities.name)
}

fun b() {
    println(Ultilities.name)
}