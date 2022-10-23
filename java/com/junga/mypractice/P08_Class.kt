package com.junga.mypractice


/*객체 생성시 정의 하기 : 생성자 이용
constructor(변수명 : 타입) : 기본생성자 -> 생략 가능
파일-클래스명 달라도 됨, 여러 파일을 한 파일 안에 넣기 가능*/
open class Human (val name : String = "Anonymous") {
/*class Human constructor(name : String) {
    val name = "noah" -> class에 적용해도 됨*/

    //this() : 부 생성자가 주 생성자의 위임을 받는 명령어
    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age} years old")

    }

    //주 생성자 일부, 1순위 실행, init 실행 후 construcor 실행
    init {
        println("New human has been born")
    }

    fun eatingCake() { //기본생성자
        println("This is so yummy")
    }

    open fun singASong() {

    }
}
//코틀린은 기본이 파이널 클래스->같은 파일 내에 있어도 접근 못함 => 오픈 필요 : class앞에 open
//상속 => : 클래스명(), 1회만 가능
//오버라이딩
class Korea : Human(){
    override fun singASong() {
        super.singASong()
        println("노래해~!")
        println("my name is : ${name}")
    }
}

fun main() {
    //val human = Human( name: "nox") => 오류 원인 찾기
//    val stranger = Human()
   // human.eatingCake()

   // val mom = Human( name: "nono", age: "32)

//    println("This human name is ${stranger.name}")

    val korean = Korea()

}