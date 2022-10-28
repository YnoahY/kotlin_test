package androidTest

fun main() {
    retFunc1()
}

fun inlineLambda1(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc1() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@ { a, b ->
        val result = a + b
        if(result > 10) return@lit println("result: $result")
    }
    println("end of retFunc")
}