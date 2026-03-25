package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()

    base.sayHello("Yurina")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Yurina")
    baseDelegate.sayHello("Nanang")
}