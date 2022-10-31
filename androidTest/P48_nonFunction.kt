package varAndFunction

fun main() {
    retFunc2()
}

fun inlineLamda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc2() {
    println("start of retFunc")
    inlineLamda(13,3,fun(a, b) {
        val result = a+b
        if(result > 10) return
        println("rsult: $result")
    }) //inlineLamda()함수의 끝
    println("end of retFunc")
}