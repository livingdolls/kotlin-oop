package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Yurina")
    println(teacher.name)
    teacher.test()
}