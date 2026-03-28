package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Hello, !")
        "Nanang"
    }

    var description: String by Delegates.observable(description) {
        property, oldValue, newValue ->
        println("${property.name} change from $oldValue to $newValue")
    }
}