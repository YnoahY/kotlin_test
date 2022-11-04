@file:JvmName("BirdPrimaryInitKt")

package classAndConstructor

//주 생성자 선언
class Bird7(var name:String, var wing: Int, var beak: String, var color: String) {
    //프로퍼티 - var, val로 선언 => 상담에 프로퍼티 이미 포함 됨

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird7("bird", 11, "long", "orange")
    println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.beak}")
}