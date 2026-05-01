package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
    if(name.isBlank()) {
        throw ValidationException("Name cannot be blank")
    }
    else if(name.length < 2) {
        throw Throwable("Name cannot be longer than two")
    }
    else {
        println("Hello, $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Takahashi")
        validateAndSayHello("Y")
        validateAndSayHello("")
    } catch (e: ValidationException) {
        println("Terjadi kesalahan ${e.message}")
    } catch (error: Throwable) {
        println(error.message)
    } finally {
        println("Finally, takahashi is cute")
    }
}