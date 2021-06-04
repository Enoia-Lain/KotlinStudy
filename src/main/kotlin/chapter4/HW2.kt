package chapter4

fun main() {

    val olist = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11)

    val evenN = olist.filter {
        it % 2 == 0
    }

    val squared = evenN.map {
        it * it
    }

    val finalsum2 = squared.sum()

    println(finalsum2)

   // val olist2 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   //     .filter { it % 2 == 0 }
    //    .map { it * it }
    //    .sum()

    ///val olist2 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   //     .filter { it % 2 == 0 }
    //    .sumOf { it * it }

}


//메서드 체이닝 (method chaining)
// 한 함수의 반환되는 값에다가, 다른 함수를 실행하는 방법.
// 가독성을 위해, . 단위로 나눈다

