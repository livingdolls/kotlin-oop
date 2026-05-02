package app

import data.Student

fun main () {
    val student = Student("Takahashi", 23)

    println(student.name)
    println(student.age)

    val result = student.let {
        "${it.name} is My Girl Friend"
    }

    println(result)

    val result2 = student.run {
        "${this.name} is My Girl Friend"
    }

    println(result2)

    val result3 = student.apply {
        "${this.name} is My Girl Friend"
    }

    println(result3)

    val restlt4: Student = student.also {
        "${it.name} is My Girl Friend"
    }

    println(restlt4)
}