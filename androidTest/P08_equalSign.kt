package androidTest

fun main() {

val a: Int = 128
val b: Int = 128

println(a == b)
println(a === b)

//참조 주소 달라짐
val c: Int = 128
val d: Int? = 128
println(c == d)
println(c === d)

}
