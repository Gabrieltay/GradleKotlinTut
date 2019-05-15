package org.example

data class Language(val name: String, val hotness: Int)

class MyLibrary {
    companion object {
        const val HOTNESS: Int = 10
    }

    fun kotlinLanguage() = Language("Kotlin", HOTNESS)
}