package data

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name!, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name!, my name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
//    Ini error karena fungsi override adalah final
//    override fun sayHello(name: String) {
//
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name!, my name is Vice President ${this.name}")
    }
}