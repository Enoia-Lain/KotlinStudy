package chapter5

fun main() {

    val text: List<String> = listOf("This", "is", "Sparta", "!!!")

    val up: (String) -> String = { str ->
        str.toUpperCase()
    }
    println(up("$text"))
}








