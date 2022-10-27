package androidTest

fun main() { //최초의 스택 프레임
    val num1 = 10 //임시 변수 or 지역 변수
    val num2 = 3 //임시 변수 or 지역 변수
    val result: Int

    result = max(num1, num2) //두번째 스택 브레임
    println(result)
}

fun max(a: Int, b: Int) = if (a > b) a else b //a,b == 임시변수