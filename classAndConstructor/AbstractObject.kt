package classAndConstructor

//추상 클래스의 선선
abstract class Printer {
    abstract fun print() //추상메서드
}

val myPrinter = object : Printer() { //객체 인스턴스
        override fun print() {
            println("출력")
        }
}

fun main() {
    myPrinter.print()
}
