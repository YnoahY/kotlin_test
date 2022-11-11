package classAndConstructor

class Calc {
    //다양한 매개변수로 오버로딩 된 메서드들
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y: String): String = x + y
}

fun main() {
    val calc = Calc()
    println(calc.add(3,2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3, 3, 2))
    println(calc.add("Hello", "World"))
}