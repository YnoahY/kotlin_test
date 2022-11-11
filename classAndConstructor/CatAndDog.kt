package classAndConstructor

interface Pet2 {
    var category: String
    val msgTags: String //val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

open class Animal(val name: String)

//1. feeding의 구현을 위해 interface Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Fee the dog a bone")
    }
}

class Cat2(name: String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    fun playWithPet(dog: Dog) { //2. 각 애완동물 종류에 따라 오버로딩 됨
        println("Enjoy with my dog.")
     }
    fun playWithPet(cat:Cat2) { //3. 고양이를 위한 메서드
        println("Enjoy with my cat.")
     }

    fun main() {
        val master = Master()
        val dog = Dog("Toto", "Small")
        val cat = Cat2("Coco","Bigfat")
        master.playWithPet(dog)
        master.playWithPet(cat)
    }
}
