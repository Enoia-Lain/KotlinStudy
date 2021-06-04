package chapter5


fun main() {

    val text: List<String> = listOf("This", "is", "Sparta", "!!!")

    val up: (String) -> String = { str ->
        str.toUpperCase()
    }
    println(text.getLongString(up))
}

fun String.getLongString(up: String): String =
    if (this.length > up.length) this else up