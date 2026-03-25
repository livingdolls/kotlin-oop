package data

import java.util.Locale
import java.util.Locale.getDefault

object Ultilities {
    var name: String = "My Ultilities"

    fun toUpper(value: String): String {
        return value.uppercase(getDefault())
    }
}