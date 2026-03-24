package app

import data.Boss

fun main() {
    val bos1 = Boss("Nanang")

    val employee1 = bos1.Employee("Yurina")
    val employee2 = bos1.Employee("Hirate")

    val bos2 = Boss("Yurina")

    val employee3 = bos2.Employee("Nanang")
    val employee4 = bos2.Employee("Hirate")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}