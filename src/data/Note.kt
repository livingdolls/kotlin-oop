package data

import java.util.Locale
import java.util.Locale.getDefault

class Note(title: String) {
    var title: String = title
        get() {
            return field
        }
        set(value) {
            if(value.isNotBlank()) {
                field = value
            } else {
                println("Invalid field")
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.uppercase(getDefault())
}