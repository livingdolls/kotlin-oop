package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee = Employee("Takahashi")
    employee.sayHello("Takahashi")

    employee = Manager("Takahashi")
    employee.sayHello("Takahashi")

    employee = VicePresident("My Takahashi")
    employee.sayHello("My Takahashi")
}