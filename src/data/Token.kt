package data

import java.util.Locale
import java.util.Locale.getDefault

inline class Token(val value: String) {
    fun toUpper(): String = value.uppercase(getDefault())
}