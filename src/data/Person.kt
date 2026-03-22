package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name!, my name is $firstName")
    }

    fun sayHello(firstNamePrama: String, lastNameParam: String) {
        println("Hello $firstNamePrama, $lastNameParam!, my name is $firstName")
    }

    fun run() {
        println("I'm run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}