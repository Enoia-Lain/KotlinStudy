package chapter3

import java.util.logging.Handler

fun main() {
    // 서로 다른 메모리 영역에 존재함.
    // 즉, 서로의 데이터가 영향을 주지 않음.

    // 계속 클래스를 생성한다면, 메모리가 부족해지지 않을까?
    // JavaVirtualMachine (자바나 코틀린이 위에 돌아가는 환경)

    // 당장 필요할 것이라고 보이는 객체와,
    // 필요 없어진 객체를 서로 분리해서
    // 주기적으로 필요없어진 객체는 메모리에서 해제됨. (Garbage Collect)
    // 는 tmi
    val talent1 = Mage()
    talent1.addMana(300)
    val talent2 = Mage()
    talent2.addMana(400)

    val computer = Computer("Ryzen 5900X", 16, "RTX3080")
    computer.cpu

    checkNotebook(Gram())
    checkNotebook(Hansung())

}

// 클래스 = 함수 + 속성이 더해진 것!
// 인스턴스화는 다른 곳에서 사용할 수 있도록, '클래스를 메모리에 할당하는 과정'
// 클래스는 보통 파스칼케이스, 첫 글자와 중간 글자들이 대문자로 작성됨.
class Mage { // 클래스 (Class)
    var Mana: Int = 0 // 속성 (Property)

    // 메서드는 보통 카멜케이스, 첫 글자는 소문자, 중간 글자는 대문자로 시작.
    fun addMana(Mana: Int) { //함수 (Function)

        // this 라는 것은, 해당 함수가 속하는 클래스나, 익명 함수를 나타냄.
        // 아래 두개는 서로 같음
        this.Mana += Mana // 보통 이방법을 선호.
        this.Mana = this.Mana + Mana
    }

    // 자바나 코틀린에서는 잘 안쓰긴 하지만 스네이크 케이스 라는 것도 존재함. ex) 단어_단어
    fun cast() {
        println("Casting..")
    }

}

// object 클래스는, 프로그램의 시작부터 끝까지 메모리에 존재하도록 설계된 클래스.
// Kotlin 한정 클래스, 자바에서는 Singleton 개념.
// 일반적인 클래스와 같이 속성과 함수를 가질 수 있음.
// 차이점은 이 객체가 생성되는 시점과 종료되는 시점이 다르다는 것.

// 일반적인 클래스
// 생성 시점- > 인스턴스화 / 종료시점 -> Garbage Collector에 의해 정리.
// object 클래스
// 생성 시점 - > 프로그램의 시작 / 종료시점 : 프로그램의 종료
// 이 프로그램이 살아있는 동안에는 MakingGuide 가 오직 1개만 존재한다.
// object 는 각기 다른 코드 간에 상태를 공유하고 싶을 때 사용.


// 상태 (state)는 프로그램이 가지는 데이터
// 행위에 대한 모든 것 + 메모리/저장소 등에 저장되는 것.
// 별도의 인스턴스화 과정 없이 백그라운드에 항상 켜져있는 것 처럼 공공재 느낌으로 쓴다고 보면 됨.

object MakingGuide {
    var point: Int = 0

    fun addPoint(point: Int) {
        this.point += point
    }
}

// 열거형 (enumerated) 클래스
// '색상' 에 대해 열거한다 (= 나열한다)
// 값에 대한 집합.
// 열거형 클래스는 별도의 인스턴스화 과정 없이, 공공재 느낌으로 사용이 가능함.
// 다만, 열거형 클래스는 동적인 값을 가지지는 못한다.

// 고정된 값을 나열하여 사용하는 것.
// 상수라는 것은, 프로그램이 정의하는 값(변수) 중에 변하지 않는 값을 의미한다.
// 주로, 고유한 KEY 값이나 종류 등을 정의할 때 사용한다.

enum class Jobs(val job: String) {
    Mage("마법사"),
    Warrior("전사"),
    THIEF("도적")
}

// 생성자(Constructor)
// '특정 클래스가 인스턴스화 한 뒤에, 바로 실행되는 함수'
// 코틀린에서의 생성자는
//  '특정 클래스가 필요로 하는 속성'
// default parameter 로 특정 속성에 기본적인 값을 설정하는 것도 가능. 아래의 경우에는  var graphics: String = "RTX3090"가 속함.
// init 블럭 : 클래스가 인스턴스화 되자마자 실행이 됨.
open class Computer(var cpu: String, var ram: Int, var graphics: String = "RTX3090") {
    init {
    println("CPU $cpu, RAM $ram, Graphics $graphics")
    }
   open fun turnOn(){
        println("켜지는중...")
    }
}

// 인터페이스는 말 그대로, 이 인터페이스를 상속받는 자식 클래스들이 반드시 구현해야 할 함수나 속성들을 정의하는 것.
// 인터페이스는 상태를 가지지 못하고 함수의 코드도 구현하지 못한다.
// 인터페이스는 상속이 가지는 규약이 없다.
// 즉, 자식 클래스는 여러개의 인터페이스를 동시에 상속받을 수 있다.
//
// (tmi) 구현체를 가지는 인터페이스도 존재한다.
interface INotebook {
fun openScreen()
}

// 상속
// 부모의 속성을 자식이 물려받고, 확장할 수 있는 것임
// 상속은 기본적으로 하나의 부모에게만 받을 수 있음.
class Gram : Computer("Ryzen 5900X",16), INotebook{
    var weight: Double = 1.73
    override fun openScreen() {
        TODO("Not yet implemented")
    }

    // 부모의 함수나 속성등을 오버라이드 할 수 있음
    // 오버라이드된 함수는 super 를 통해 부모의 코드가 불릴지/ 불릴지 말지 결정할 수 있음.
    override fun turnOn() {
        // super 의 위치는 어디든지 상관 x
        super.turnOn()
    }
}

class Hansung: Computer("Ryzen 5900X",16), INotebook{
    override fun openScreen() {
        TODO("Not yet implemented")
    }
}

// 다형성
// 하나의 슈퍼타입이 있다면, 서브타입을 고려하지 않고 로직을 구성할 수 있다.
// INotebook 을 상속받은 하위 클래스들 (그램, 한성)들 구별 없이 넣어서 사용할 수 있다.
// 즉, 이 함수에서는 공통적인 INotebook 에 대한 공통적인 코드를 넣을 수 있다.
fun checkNotebook(notebook: INotebook) {
    notebook.openScreen()

    // is - > 특정 변수가 어떤 '타입' 인지 확인하는 키워드
    // 즉, 실제 변수의 값 (상태)는 따지지 않고, 어떤 타입인지만 확인함
    // gram, gram1, gram2, gram3 이라는 각기 다른 인스턴스화된 변수가 유입되어도
    // Gram 타입이므로 공통적으로 처리됨.
    when (notebook){
        is Gram -> println("그램")
        is Hansung -> println("한성")
    }
}