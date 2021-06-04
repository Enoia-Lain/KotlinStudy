package chapter1

fun main() {
    println(hw(2,2,2))
    println(hw2(a = 1,1,1))
}





fun hw(a: Int, b: Int, c: Int): Int {
    val result: Int
    when {
        a % 2 == 0 && b % 2 == 0 && c % 2 == 0 -> return a + b + c
        a % 2 == 1 && b % 2 == 1 && c % 2 == 1 -> return a * b * c
        else -> return 0

    }
}


fun hw2(a: Int, b: Int, c: Int): Int {
    val result: Int
    if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
        return a + b + c
    } else if (a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
        return a * b * c
    } else {
        return 0
    }

}