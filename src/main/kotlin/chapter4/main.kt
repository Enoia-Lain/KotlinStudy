package chapter4


fun main() {
    // 자료구조
    // String, Int, Long, Float, Double 등 각종 타입
    // Array, List, Set, Map, Pair, Range 같은 것도 있다.

    // Collection (모음집)
    // 같은 타입에 대해 값을 모아놓는 변수를 의미한다.

    // Array (배열)
    // 이 Array의 특징은, 모음집의 크기가 결정되어 있다.
    val inta = IntArray(5) // 이 배열에 들어가는 변수는 총 5개이다.

    // 값 할당
    // 배열이름[Index] = 값
    inta[0] = 1
    inta[1] = 2
    inta[2] = 3
    inta[3] = 4
    inta[4] = 5
//    inta[5] = 6 // ArrayIndexOutOfBoundsException (길이 5인 배열에 Index 5는 범위 초과)
    println(inta[4])

    // List (리스트)
    // Array와 달리, 모음집의 크기가 결정되어있지 않다. (즉, 메모리에 들어가기만 한다면 무제한)
    // 가변성과 불변성 속성이 각각 있는 것
    val intlist : List<Int> = listOf<Int>() // 불변성 -> add나 set, remove같은 함수가 없음
    val mintlist : MutableList<Int> = mutableListOf<Int>() // 가변성

    // 값 할당 (add 함수 사용, 리스트의 맨 끝에 추가)
    mintlist.add(3) // 3번째 인덱스
    mintlist.add(4) // 4번째 인덱스

    // 값 할당 (다른 리스트의 원소를 모두 추가)
    mintlist.addAll(listOf(5, 6, 7))
//    mintlist[3] = 8 // list.set와 같음, 다만 코틀린 문법에 의해 [index] = value 가능
    mintlist.size // 현재 리스트의 크기

    // addAll(list) 와, 중첩된 리스트는 서로 다름
    // 중첩된 리스트는 List<List<Int>>

    // List를 비롯한 Collection 타입들에 대해 쓸 수 있는 것들
    // map (변환) -> 하나의 원소를 다른 값으로 변환하는 기능
    // mintlist의 제곱된 리스트를 구하고 싶다
    val mapResult = mintlist.map {
        // it -> '암묵적인 파라미터'
        // 코틀린은 기본적으로 '함수' 자체를 인자로 취급할 수 있는데, (= 고차함수)
        // 인자로 취급된 함수의 인자가 1개라면, it를 사용할 수 있다.
        // 수요일 자세하게 배울 예정이므로 일단 이렇게만 넘어가는거로.
//        it * it
        it.toString()
    }

    // filter (필터) -> 리스트에서 조건에 맞는 원소만 추출
    val filterResult = mintlist.filter {
        it % 2 == 0
    }

    // sum (더하기) -> 리스트의 모든 원소를 다 더함
    val sumResult = mintlist.sum()

    // average (평균) -> 리스트의 모든 원소를 다 더하고, 크기로 나눔
    val averageResult = mintlist.average()

    // reduce (감가) -> 리스트의 첫번째부터 마지막까지 돌면서 특정 행동을 실행
    // acc: 이전에 행동을 수행한 결과
    // i: 현재 수행할 값
    // [3, 4, 5, 6, 7] 에 대한 리스트가 있을 때, reduce를 해보면..
    // reduce는 리스트의 크기 - 1만큼 행동을 반복
    // 1 -> acc = 3, i = 4 (acc는 초기값, 4는 다음 값) => 12
    // 2 -> acc = 12, i = 5 => 60
    // 3 -> acc = 60, i = 6 => 360
    // 4 -> acc = 360, i = 7 => 2520
    val reduceResult = mintlist.reduce { acc, i -> acc * i }

    // sort (정렬) -> 리스트의 원소들을 규칙에 맞게 정렬하는 것
    // 기본적으로 ~ed가 붙은 것은, 정렬하여 '새로운 리스트'로 반환 (다른 이름으로 저장 느낌)
    // 반대로, 붙지 않은 것은 주어진 리스트를 정렬만 함
    // Desending: 내림차순 정렬
    mintlist.sort() // mintlist를 오름차순으로 정렬만 함
    mintlist.sorted() // mintlist를 오름차순으로 정렬하고 새로운 리스트로 반환
    mintlist.sortDescending() // mintlist를 내림차순으로 정렬만 함
    mintlist.sortedDescending() // mintlist를 내림차순으로 정렬하고 새로운 리스트로 반환

    println(mintlist)
    println(mapResult)
    println(filterResult)
    println(sumResult)
    println(averageResult)
//    println(reduceResult)
}