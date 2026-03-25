package data

import java.util.Locale
import java.util.Locale.getDefault

class Application(val name: String) {
    object Ultilities {
        fun toUpper(value: String): String {
            return value.uppercase(getDefault())
        }
    }
}