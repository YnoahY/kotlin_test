package androidTest

fun main() {
    retFunc3()
}

fun inlineLambda2(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc3() {
    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda
        println("result: $result")
    }
    println("end of retFunc")
}