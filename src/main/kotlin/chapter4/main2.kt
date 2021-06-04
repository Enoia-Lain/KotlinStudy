package chapter4

fun main() {
    // Set
    // Set는 기본적으로 List와 거의 같다.
    // 하지만, Set는 중복을 허용하지 않는다.

    val list = listOf<Int>(1, 2, 2, 3)
    val set = setOf(1, 2, 2, 3)
    val distinct = list.distinct() // 중복을 제거하는 함수, 내부에서는 set로 변환했다가 list로 변환

    println(list)
    println(set)
    println(distinct)

    // Map
    // Map는 Index 기반의 리스트가 아니라, 특정 Key : 특정 Value의 관계를 가짐
    // Array, List, Set -> Key가 Index (즉 int), Value는 특정 타입
    // Map -> Key도 특정 타입, Value도 특정 타입
    val stringMap = mutableMapOf<String, String>()
    stringMap["A"] = "a"
    stringMap["B"] = "b"
    println(stringMap)
    stringMap["C"] = "c"
    stringMap["B"] = "ac" // 같은 키로 재할당 하면, 기존 값은 증발하고 새로운 값만 남는다.
    println(stringMap)

    // Map -> List
    stringMap.keys // 특정 맵의 키만 남긴 리스트를 반환 (Set)
    stringMap.values // 특정 맵의 Value만 남긴 리스트를 반환 (List)

    // Pair (짝), Triple
    // Pair -> 두 개의 변수만 들어가는 형태
    // Triple -> 세 개의 변수만 들어가는 형태
    // Pair, Triple 는 다른 자료구조와 다르게, 각각 타입이 달라도 된다.
    val pair1 = Pair<String, Int>("a", 1)
    val pair2 = "a" to 1 // to 라는 함수는, Pair를 생성하는 Extension function
    val triple1 = Triple<String, Int, Double>("a", 1, 1.0)

    println(pair1)
    println(triple1)

    // Range
    // 숫자의 시작부터 끝 까지 있는 형태
    val range1 = 1..100

    // 상호 변환
    // List에서 출발하는 것들
    val foo: List<Int> = listOf<Int>(1, 2, 3)
    val fooSet: Set<Int> = foo.toSet() // List -> Set 로 변환
    val fooArray: Array<Int> = foo.toTypedArray() // List -> Array<Int> 로 변환
    // Int, Long, Double, Float, Boolean와 같은 원시적(Primitive) 타입에 대해서는...
    val fooIntArray: IntArray = foo.toIntArray() // List -> IntArray로 변환 (단, 부가적인 요소임)
    fooSet.toList() // Set -> List
    fooSet.toMutableList() // Set -> MutableList (add, set가 있는 리스트)
    fooArray.toList() // Array -> List
    fooArray.toMutableList() // Array -> MutableList
    stringMap.keys // Map -> Key만 꺼내서 Set
    stringMap.values // Map -> Value만 꺼내서 List
    stringMap.entries // Map -> List<Map.Entry<?, ?>>.
    // Map.Entry는 Pair와 비슷하게 key, value 두 개의 값을 가지고 있는 클래스
}