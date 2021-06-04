package chapter2

import java.lang.Exception

fun main() {
    // for
    // 반복문 - > 특정한 작업을 반복하는 분기를 지정하는 문장.

    // ex) 1-10까지 모두 더하는 코드의 경우. (반복문 사용)

    var sum: Int = 0
    for (i in 1..10) {
        // i 라는 값이 1-10까지 증가하는 동안, 해당 함수가 계속 실행된다는 의미의 문장.
        println(i)
        sum = sum + i
    }
    println(sum)

    // List - 변수들을 담는 보관함. (보관함 최대 갯수는 정해져 있지 않음.)   ※ 금요일날 자세히 배움.
    // 리스트에 담긴 변수들은 'element' (원소라고 불림)
    // 리스트에 담긴 변수들은 같은 타입이여야 한다. (문자면 문자 숫자면 숫자..)
    val list: List<Int> = listOf(1, 2, 3)
    for (element in list) {
        println(element)
    }

    val range: IntRange = 1..10
    range.first // 1
    range.last // 10

    var i = 0
    while (i <= 5) {
        println(i)
        i = i + 1

    }
    var j = 0
    while (true) {
        println(j)
        if(j >= 5){
            break
        }
        j = j + 1
    }
    // Exception
    // 오-류 라는 뜻
    try {
        // 이 블럭 안에 있는 코드들은 Exception 발생해도, 앱이 종료되지 X
        val error = 5 / 0
        val success = 5 /1
    } catch(e: Exception){
        // Exception 발생했을 때 이 블럭 안에 있는 코드가 실행됨.
       // e.printStackTrace()
        println("Error")
    } finally {
        println("finally")
    }
    println("Complete")
}