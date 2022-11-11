package classAndConstructor

interface Bird10 {
    val wings : Int
    fun fly()
    fun jump() = println("bird jump!")
}

interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump() = println("jump!, max speed: $maxSpeed")
}

class Pegasus : Bird10, Horse {
    override val wings: Int = 100
    override val maxSpeed: Int = 100
    override fun fly() = println("Fly!")
    override fun run() = println("Run!")
    override fun jump() {
        super<Horse>.jump()
        println("and Jump!")
    }
}

fun main() {
    val pegasus = Pegasus()
    var jump = pegasus.jump()
}
