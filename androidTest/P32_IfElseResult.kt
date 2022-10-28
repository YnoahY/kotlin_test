package androidTest

fun main() {
    var data = 10
    val result = if (data > 0) {
        println("data > 0")
        true
    } else {
        println("dta <= 0")
        false
    }
    println(result)
}