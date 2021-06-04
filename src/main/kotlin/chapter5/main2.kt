package chapter5

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(list.even())

    // Scope (범위)
    // (나중에 상세하게 배울 예정) 클래스의 스코프, 함수의 스코프, 람다의 스코프 같이
    // 특정 함수나 속성을 사용할 수 있는 범위를 지정
    list.operate {
        this.filter { it % 2 == 0 }
    }

    val result = list.chunkList(4)
    println(result)
}


// receiver 가 존재하는 리터럴 타입의 고차함수
// 고차함수 + Extension Function
fun List<Int>.operate(block: List<Int>.() -> Unit) {
    this.block()
}

// Extension Function (확장 함수)
// 정의 : 특정 클래스에 기능을 더해, 마치 그 클래스의 함수인 것 처럼 사용이 가능한 것
fun List<Int>.even(): List<Int> {
    return this.filter { it % 2 == 0 } //이 때 this 는 확장 함수된 대상 (여기서는 List<Int>를 의미)
}


// 특정 숫자를 인자로 받아서, 그 사이즈 만큼 분할하는 함수를 만들 것
// Input: List<Int>, Int => [1,2,3,4,5,6], 4
// Output: List<List<Int> => [[1,2,3,4] [5,6]]

fun List<Int>.chunkList(size: Int): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    // 임시로 값을 담을 리스트를 만들어줌
    val temp = mutableListOf<Int>()
    for (element in this) {
        temp.add(element) // 하나씩 추가해봄
        if (temp.size == size) { //만약 임시 리스트가 원하는 사이즈와 동일하다면
            val a = mutableListOf<Int>()
            //자바의 메모리 영역 한계로 인해
            //result.add(temp)를 했을 때에는 temp 에 있는 값이 복사되어
            //result 에 포함되는 것이 아닌 겉 껍데기만 추가되게 된다. (shallow copy)
            //따라서, temp 가 변동하면 result 에 담은 것도 같이 영향을 받게 되어
            //클리어가 되는 것 이다.

            //그러므로 여기에서는, 새로운 리스트 객체를 메모리에 할당하고
            //새 리스트 객체에 temp 에 있는 값을 추가 (복사) 하여
            //result 에 더한다. (= deep copy )
            //이렇게 되면, temp 를 clear 하거나 add 해도
            //result 에 직접 temp 를 담은 것이 아니기 때문에 영향을 받지 않는다.
            a.addAll(temp)
            result.add(a)
            temp.clear()
        }
    }
    if (temp.isNotEmpty()) {
        result.add(temp)
    }
    result.add(temp)
    return result
}
