package classAndConstructor

//주 생성자 선언
class Bird5 constructor(_name: String, _wing: Int, _beak: String, _color: String) {
    //프로퍼티
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird5("Youbird",2,"long","red") //기본값이 있는 것은 생략하고 없는것만 전달
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.beak}")
}