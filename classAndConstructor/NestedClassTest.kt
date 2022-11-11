package classAndConstructor

//중첩 클래스
class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" //외부의 ov에는 접근 불가
    }
    fun outside() {
        val msg = Nested()
            .greeting() //Outer 객체 생성 없이 중첩 클래스의 메서드 접근
            println("[Outer]: $msg, ${Nested().nv}")//중첩 클래스의 프로퍼티 접근
       }

    //바깥 클래스에서 접근 방법
    fun accessOuter() { //컴패니언 객체는 접근 가능
        println(contry)
        getSomething()
    }
    companion object { //컴패니언 객체는 static 처럼 접근 가능
        const val contry = "korea"
        fun getSomething() = println("Get something....")
    }
}

fun main() {
    //static 처럼 Outer의 객체 생성 없이 Nested객체를 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    //Outer.outside() =>에러 Outer객체 생성 필요
    val outer = Outer()
    outer.outside()
    outer.accessOuter()
}
