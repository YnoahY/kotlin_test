package androidTest

fun main () {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}")
    
    //null은 값이 없음 -> else로 가서 -1 출력
}