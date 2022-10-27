package androidTest

fun main() {
    /* 표준형
fun sum(a: Int, b: Int): Int {
    return a + b
}
*/

/* 간략화된 함수
fun sum(a:Int, b: Int): Int = a + b
=>{}생략: 처리구문 1개
=> return 생략: Int(반환형)의 존재 때문에
*/

    //반환 자료형 생략
    fun sum(a: Int, b: Int) = a+ b

//계산 된 값을 던져줄 곳이 있어서 return값 있음
//=>함수 아래 println이 있으면 Unit임

}
