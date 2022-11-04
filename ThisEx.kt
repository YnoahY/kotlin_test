package classAndConstructor

class Bird3 {
    //1. 프로퍼티 선언
    var name: String
    var wing: Int
    var beak: String
    var color: String

    //2. 보조 생성자 초기화
    constructor(_name: String, _wing: Int, _beak: String, _color:String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    //메서드
    fun fly() = println("fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird3("mybird", 2, "short", "blue") //4. 생성자의 인자로 객체 생성과 동시에 초기화
    println("coco.color: ${coco.color}") //객체 멤버 프로퍼티 읽기
    coco.fly() //7. 객체 멤버 메서드 사용
    coco.sing(3)
}