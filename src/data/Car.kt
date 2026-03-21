package data

class Car(
    paramBrand: String,
    paramName: String,
    paramYear: Int = 2020
) {

    init {
        println("Car $paramBrand, $paramYear dibuat")
    }

    constructor(paramBrand: String,  paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary constructor ")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}