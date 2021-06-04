package chapter2

fun main() {
    val Mage = Mage(Mana = "마나")
    Mage.foo()
    Mage.bar

    val archmage = archmage()
    archmage.foofoofoo()
    archmage.bar
}


// 클래스란 장롱같은 것.
// 하나의 객체를 만들어가는 과정 -> 클래스
// 클래스는 장롱 같이 하나의 객체 안에 여러개의 property(속성), 함수(function)을 담을 수 있다.
// 이 클래스는, 다른 곳에서 import 를 통하여 접근, 사용할 수 있다.
// 클래스를 인스턴스화 하기 위해서, 특정 인자를 필요로 할 때가 있는데, 그것이 생성자이다 (constructor)
// 클래스는 기본적으로, 상속을 받는 것을 거부함, 이 것을 풀려면,클래스 앞에 open 이라는 키워드를 붙여준다.
// 함수들도 기본적으로 오버라이딩 받는 것을 거부함. 이 것을 풀려면 함수(fun) 앞에 open 이라는 키워드를 붙여주면 해결.

open class Mage(val Mana: String) {
    val bar = " abc"

    open fun foo() {
        println("Hello, world!")
    }

    private fun foofoo() {
        println("Hello, world!")
    }
}

class archmage : Mage("마나") {

    //override fun : 해당 함수를 부모로부터 오버라이딩 했음.
    override fun foo() {
        // 내가 자식된 노릇으로서 부모 함수의 행동을 일단 실행함.
        // super 가 없으면, 부모 함수의 행동을 완전히 무시함
        // super 의 위치는 함수 안이라면 어디든지 상관이 없음.
        super.foo()
        println("Hello, world!")
    }

    // 시그니처가 다르면 다른 메서드로 간주함. (오버로딩).
    // 시그니처라고 하는 것은, 특정 함수의 구별자 역할
    // 시그니쳐의 예시
    // 패키지.클래스.함수이름(인자타입)
    // chapter.Archmage.foofoofoo()
    fun foofoofoo() {
        println("Hello, world!")
    }

    fun foofoofoo(a: String) {
        println("Hello, world!")
    }
    fun foofoofoo(a: String, b: String) {
        println("Hello, world!")
    }

}
// 프로그래밍에 있어 패러다임이 여러가지가 있음.
// 1) 선언형 프로그래밍 : 함수로 나누어 코드를 실행하는 것을 주로 삼는 방법. (C 언어와 같은 예전 구형 언어)
// 2) 객체지향 프로그래밍 : 객체로 나누어 코드를 실행하는 것을 주로 삼는 방법 ( 자바, 코틀린)
// 3. 함수형 프로그래밍 : 1,2번이 합쳐진 대신, 특정 함수가 다른 곳에 영향을 미치지 않는 것을 의미함.
// sum, minus , power (지수) 등과 같이 , A라는 인풋에 대해 'A' 라는 일간된 결과를 나타내는 것을 의미.
// 코틀린은 기본적으로 객체지향의 성격을 가지고 있으면서, 언어의 설계상 함수형 프로그래밍의 의도도 담고 있다.
// (불변성 타입 등으로)


// 객체지향의 4 요소
// 캡슐화
// 특정 클래스 안에 있는 요소들은 전부 해당 클래스와 관련이 있는 내용이다.
// = 번들링이라고도 부름 , 이 클래스에 대해 '인스턴스화' 라는 것을 통해 다른 곳에서 클래스에 대해 접근하고 사용할 수 있다.

// 정보은닉 (private, public, protected)
// 코틀린의 모든 함수와 변수는 public 이 기본임.
// private 로 선언 할 경우 해당 클래스 내에서만 접근이 가능하고 외부에서는 접근하지 못함.
// protected 로 선언할 경우에는 해당 클래스에서 및 자식에서 접근이 가능하다.

// 상속 (오버라이딩)
// 상속의 규칙 : 한 개의 자식은 한 개의 부모로 밖에 상속받지 못한다.

// 다형성 (제너릭, 오버로딩, 타입변환)
// 제너릭 : 특정 클래스가 여러 서브타입을 가질 수 있게 하는 것. 아까전의 List<Int> 라는 것도, List 가 제너릭을 보유하고 있다는 것.
// 오버로딩 : 서로 다른 시그니처를 가지고 있다면 함수 명은 중복되어도 됨.


fun convert (a: String) {
    //타입 변환이란 , 특정 타입을 변환시켜 다른 타입으로 치환하는 것
    //묵시적 타입 변환
    //자연스럽게 바뀌는 것이기 때문에 버려지는 값이 없음.
    val length: Int = a.length // 32비트형태의 정수이므로 2^32 범위
    val Double: Double = length.toDouble() // 64비트 실수이므로 2^64 범위, 더 큰 범위의 자료형으로 바꾸는 것은 '자료형 승급'이라고도 함.

    //명시적 타입 변환
    // {변수} as {타입} -> 해당 변수를지정한 타입으로 강제로 변환함.
    // 강젤 변환하기에 바꾸나서 남은 정보는 버림.
    val text: String? = a as String
    val text2 = a as Int


}