package androidTest

fun main() {
    val a: Int = 128
    val b = a
    println(a === b)


    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교 : true
    println(c === d) //값의 내용은 같지만 참조 비교해 주소가 다름(다른객체) : false
    println(c === e)
}