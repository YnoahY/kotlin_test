package androidTest

fun main() {
    var a : Any = 1 //Any형 a는 1로 초기화 될 때 Int형 됨
    a = 20L // Int형 a는 변경된 값 20L에 의해 Long형 변환
    println("a: $a type: ${a.javaClass}") // a 자바 기본형을 출력하면 long 나옴
}