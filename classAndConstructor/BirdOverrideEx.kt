package classAndConstructor

open class Bird9 (var name: String, var wing: Int, var beak: String, var color: String) { //프로퍼티
    //메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")//오버라이딩 가능 메서드
}

class Parrot1(name: String, wing: Int = 2, beak: String, color: String, //매개변수
                // 마지막 인자만 var로 선언되어 프로퍼티가 추가됨
                var language: String = "natural") : Bird9(name, wing, beak, color) { //상속

                    fun speak() = println("Speak! $language")// Parrot에 추가된 메서드

    override fun sing(vol: Int) { //오버라이딩 된 메서드
        println("I'm a parrot! Tghe volume level is $vol")
        speak() //변경 된 내용
    }
}

fun main() {
    val parrot1 = Parrot1(name = "myparrot", beak = "short", color = "multiple")
    parrot1.language = "English"
    println("Parrot: ${parrot1.name}, ${parrot1.wing}, ${parrot1.beak}, ${parrot1.color}, ${parrot1.language}")
    parrot1.sing(5) //변경 된 메서드 실행 가능
}