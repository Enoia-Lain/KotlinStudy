package chapter1

fun main() {
 hello()

}

// Function(함수)의 구조는
// fun {이름} {인자...} {}

fun hello() {
    println("Hello, World!")
    println("Hello, World!!")
    println("Hello, World!!")
    println("Hello, World!!!")
    println("Hello, World!!!!")
}

// val a: String
fun hello2(a: String) {
    println("Hello, $a")
}

// 반환형이 있는 함수 (Int)
fun sum(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun sum2(a: Int, b: Int) = a + b

// Control Flow(분기)
// If, For , When , Range 등


// Control Flow - If
// a가 짝수 면 true, 홀수면 false

fun foo(a: Int): Boolean {
    val result: Boolean
    if (a % 2 == 0) {
        return true
    } else {
        return false
    }

}

// a가 5 이상이면 true ,0이면 null 그 이외에는 false 반환
fun foo2(a: Int): Boolean? {
    val result: Boolean
    if (a >= 5) {
        return true
    } else if (a == 0) {
        return null
    } else {
        return false
    }

}

// a 가 5 이상이면 true, 0이거나 -1이면 null, 그 이외에는 false 반환.
fun foo3(a: Int): Boolean? {
    val result: Boolean
    if (a >= 5) {
        return true
    } else if (a == 0 || a == -1) {
        return null
    } else {
        return false
    }

}

// a 가 5 이상이고 10 이하면 true, 0이거나 -1이면 null, 그 이외에는 false 반환.
fun foo4(a: Int): Boolean? {
    val result: Boolean
    if (a >= 5 && a <= 10) {
        return true
    } else if (a == 0 || a == -1) {
        return null
    } else {
        return false
    }


}
// a가 5 이상 10이하면  true
// a가 10 초과면 true
// a가 0이거나 -1이면 null
// 그이외에는 false


// when 문법의 경우에는 if-else 조건중 조건항이 3개가 초과할 경우 사용하기를 권장.
fun foo5(a: Int): Boolean? {
    val result: Boolean
    when {
        a >= 5 && a <= 10 -> return true
        a > 10 -> return true
        a == 0 || a == -1 -> return null
        else -> return false

    }
}

