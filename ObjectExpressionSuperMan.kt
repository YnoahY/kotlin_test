package classAndConstructor

open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object: Superman() { //1. object 표현식으로 fly() 구현의 재정의
        override fun fly() = println("I'm not a real superman. I can't fly...!")
    }

    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}

//하위 클래스를 만들지 않고도 새로운 구현인 fly() 포함 가능