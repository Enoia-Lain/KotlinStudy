package chapter1

fun main() {
    print("Hello, world!")
    println("Hello, World!") // ln = new line의 약자, 선바꾸기.

    // val {이름} : {타입} = "문자열"
    val first: String = "abc"
    val sec: String = "123"

    // Int, Long -> 둘 다 정수형
    // Int - 32비트의 글자 (대부분의 수를 표현 가능, 주로 사용함.)
    // Long - 64비트의 글자 (Int 로는 다룰 수 없는 수를 사용할때 쓰임, 항상 끝에 l을 붙임.)

    val a: Int = 20
    val b: Long = 30L

    // Float, Double - 둘 다 실수형
    // Float - 32비트의 실수 (메모리 부족할 경우에 사용. 항상 끝에 f를 붙임.)
    // Double - 64비트의 실수(주로 사용.)
    // '정확도' - 부동소수점 (지금은 신경쓰지 x)
    val c: Float = 20.0f
    val d: Double = 20.0

    // Null
    // 존재하지 않는 값.
// 오류가 나올 확률이 높음, 실 사용시에 말고 코딩하는 구간에서 강제적으로 체크하게 함으로서 추후 버그로 위험으로 시간을 절약하게 도와줌.
    // 출력 string 에 ?를 붙임으로서 null 값이 나올 수 있다고 알려줄 수 있음.
    val e: String? = null
    val f: Int? = null
    val g: Double? = null


    // val h : String =null // String이 Non- null 값이므로 null이 들어갈수 X
    // 타입 추론
    // 컴파일러가 해당 값을 이미 알기 때문에 타입을 굳이 적어주지 않아도 괜찮음.

    val i = 20.0f
    val j = 20.0

    //연산자
    //값을 처리하는데 사용하는 것. 기반.
    val number = 30
    val boolean = true //boolean = 참, 거짓을 나타내는데 쓰임


    //값을 변화시키는 연산자들
    println(number + 20) //50
    println(!boolean) //false

    // 조건을 찾는 연산자들.
    println(number >= 30)// true
    println(number < 30) //false

    // 가변성 : 변할 수 있는 속성. - > var
    // 불변성 : 변할 수 없는 속성. - > val

    var foo = "abc"
    var bar = "abc"

    //foo = "def" // foo가 변할 수 없는 값이기 떄문에, 재할당 할 수 없음.
    bar = "def" // bar은 var 뒤에 있어 변할 수 있는 값이기 때문에, 재할당이 가능함.

    val weather = "맑음"
    println("오늘의 날씨는" + weather + "입니다")
    println("오늘의 날씨는 $weather 입니다")
    println("오늘의 날씨는 ${weather.length} 입니다.")


}