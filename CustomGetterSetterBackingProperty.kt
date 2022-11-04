package classAndConstructor

class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    //프로퍼티
    var name: String = _name //값받음
        get() {
            if (tempName == null) tempName = "NONAME"
            //=>3항 연산자: tempName에 값이 없으면 ? 뒤의 값을 값이 있으면 return
            return tempName ?: throw AssertionError("Asserted by others")
        }

    var age: Int = _age
}

fun main() {
    val user2 = User2(1, "noah", 34)
    user2.name = ""
    println("user3.name = ${user2.name}")
}