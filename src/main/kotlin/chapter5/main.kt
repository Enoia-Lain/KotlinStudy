package chapter5

fun main() {
    // Extension Function (확장 함수)
    // 정의 : 특정 클래스에 기능을 더해, 마치 그 클래스의 함수인 것 처럼 사용이 가능한 것
    val list = listOf(1, 2, 3, 4, 5)
    println(list.even())


    // Higher - order function (고차함수)
    // 정의 : 함수를 '인자' 로 취급하여 사용하는 기술
    // 함수 정의법 fun name(a: String) : Int

    val foo: (String) -> Int = { str ->
        str.length
    }
    println(foo("abc"))

    // 반환형이 없는 경우?
    // fun name(a: String)
    // Unit 은 '반환형이 없다' 라는 것을 의미함.
    // fun name(a: String) : Unit <<-이 원래 형태지만 평상시에는 생략.
    // 고차함수등 타입으로 사용할 때에는 생략할 수 없으므로 나타내줘야함.
    val foo1: (String) -> Unit  = {str ->
        println("Hello, $str")
    }
    foo1("world")

    // 고차 함수의 인자가 1개일 때에만, 암묵적으로 파라미터의 이름을 적지 않는다.
    // 대신, 'it' 이라는 이름을 사용한다. (implict parameter)
    val foo2: (String) -> Unit  = {
        println("Hello, $it")
    }
    foo2("world")


    foo3(foo1) // 고차함수가 타입인 변수를 넘기는 방법, 공통적인 행동을 정의할 때 사용
    foo3(::foo4) // 어딘가에 선언된 함수를 넘기는 방법 , 쓰는 곳이 거의 없음
    foo3 { //별도의 함수나 변수로 선언하지 않고, 직접 블럭을 넘기는 방법 (tail - lambda (꼬리-람다), 함수의 마지막에 있는 고차함수= 람다)
        println(it.toLowerCase()) // 문자열을 전부 소문자로 만드는 함수
    }


}

fun foo3(block: (String) -> Unit) {
    block("aaa")
}


fun foo4(a: String){
    println(a.toUpperCase())
}



