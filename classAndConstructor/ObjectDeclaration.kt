package classAndConstructor

//1. object 키워드를 사용한 방식
object OCustomer {
    var name = "KingKong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")

    init {
        println("Init!")
    }
}

class Hobby(val name: String)
fun main() {
    OCustomer.greeting() //객체의 접근 시점
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}

// object 선언 방식 => 접근 시점에 객체가 생성
// 그렇기 때문에 생성자 호출을 하지 x => object 선언에는 주/부 생성자 사용 불가
// 자바에서는 OCustomer.INSTANCE.getName(); 으로 접근함
