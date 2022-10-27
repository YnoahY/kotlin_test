package androidTest

fun main() {
    var a = 1
    val str1 = "a = $a" // :String 생략
    val str2 = "a = ${a + 2}" // :String 생략

    println("str1: \"$str1\", str2: \"$str2\"")
}