package classAndConstructor

class Person4(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false //1. 초기화 확인 용도

    val person : Person4 by lazy {
        isPersonInstantiated = true //2. lazy를 사용한 person 객체의 지연 초기화
        Person4("kim", 23) //3. 이 부분이 lazy 객체로 반환됨
     }

    val personDelegate = lazy { Person4("hong", 40)} //4. 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") //5. 이 시점에서 초기화
    println("prsonDelegate.value.name = ${personDelegate.value.name}") //6. 이시점에서 초기화

    println("prson Init: $isPersonInstantiated")
    println("personDelegte Init: ${personDelegate.isInitialized()}")
}