package program

import annotations.Fancy

@Fancy(author = "Takahashi")
class MyAplication(val name: String, val version: Int) {
    fun info(): String = "Hello World $name-$version"
}