package androidTest

fun main() {
    fun sum(no: Int): Int {
        var sum = 0
        for (i in 1..no) {
            sum += i
        }
        return sum //호출한 곳으로 값 되돌려줌
    }
    val name: String = "kkang"
    println("name: $name, sum: ${sum(10)}, plus: ${10 +20}")
}
/*
fun main() {
    fun 함수 이름(매개변수명: 타입): 반환타입 {
        변수 변수명 = 0 //자동인식으로 인해 :Int생략
        for (i in 1..no) { //for in - 셀수 있는 자료를 하나씩 꺼내서 {} 돌림
            sum += i //sum = sum + i
        }
        return sum //호출한 곳으로 값 되돌려줌
    }
    상수 상수명: 타입 = "kkang"
    println("name: $name, sum: ${sum(10)}, plus: ${10 +20}") //표현식 이용해서 출력
}
*/
