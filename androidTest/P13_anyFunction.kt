package androidTest

fun main() {
    checkArg("Hello") //문자열 인자
    checkArg(5) //정수 인자
}

fun checkArg(x:Any) { //인자를 Any형으로 받음
    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}