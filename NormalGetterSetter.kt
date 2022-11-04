package classAndConstructor

class User(_id: Int, _name: String, _age:Int) {
    //프로퍼티
    val id: Int = _id
        get() = field
    
    var name: String = _name
        get() = field
    set(value) {
        field = value
    }
    
    var age: Int = _age
    get() = field
    set(value) {
        field = value
    }
}

fun main() {
    val user1 = User(1, "kildong", 30)
    // user1.id = 2 => val 프로퍼티는 값 변경 불가함 -> 오류
    user1.age = 35 //setter동작
    println("user1.age = ${user1.age}") //getter 동작
}