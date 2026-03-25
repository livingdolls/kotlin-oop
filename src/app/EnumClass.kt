package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val female = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val femaleFromString = Gender.valueOf("FEMALE")

    println(man)
    println(female)
    println(allGenders.toList())

    man.showDescription()
}