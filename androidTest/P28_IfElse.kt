package androidTest

fun main() {
    var a: Int = 12
    var b = 7 //형 생략

    //블록과 사용
    val max = if (a>b) {
        println("a선택")
        a
    } else {
        println("b선택")
        b
    }
    println(max)
}

/*표준식
    => var max: Int
        if (a > b)
            max = a
        else
            max = b

*간략화
    => val max1 = if (a > b) a else b
 */