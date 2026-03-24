package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Yurina", 18)
    student.sayHello("Nanang")
    println(student.upperName)
}