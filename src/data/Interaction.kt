package data

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface Multiple {

}

// interface bisa inherit interface tapi tidak bisa ke class
interface Go: Multiple {
    fun go() {
        println("Go!")
    }
}

interface MoveA {
    fun move() {
        println("MoveA!")
    }
}

interface MoveB {
    fun move() {
        println("MoveB!")
    }
}

// boleh lebih dari 1 interface
class Human(override  val name: String) : Interaction, Go, MoveA, MoveB {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun move() {
        super<MoveB>.move()
        super<MoveA>.move()
        println("Move human")
    }
}