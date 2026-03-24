package data

import java.util.Locale
import java.util.Locale.getDefault

class Student(val name: String, val age: Int) {
}

fun Student?.sayHello(name: String) {
    if(this != null) {
        println("Hello $name!, my name is ${this.name} my age is ${this.age}")
    }
}

val Student.upperName: String
    get() = name.uppercase(getDefault())