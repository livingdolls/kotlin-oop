package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Yurina Hirate")
    println(note.title)

    note.title = ""

    println(note.title)

    val bigNote = BigNote("Hirate Yurina")
    println(bigNote.title)
    println(bigNote.bigTitle)
}