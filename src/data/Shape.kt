package data

open class Shape {
     open val corner: Int = -1

    open fun printName() {
        println("Shape")
    }
}

class Rectangle : Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner

    override fun printName() {
        println("Rectangle")
        super.printName()
    }
}

class Triangle : Shape() {
    override val corner: Int = 5
}