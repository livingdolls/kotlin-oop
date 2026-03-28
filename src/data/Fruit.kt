package data

data class Fruit(val quantity: Int) {
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(quantity - fruit.quantity)
    }
}