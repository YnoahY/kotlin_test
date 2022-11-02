package classAndConstructor

fun main() {
    val user = User(1, "sean", 30) //User(constructor)(1, "sean", 30) => constructor 생략 되어 있음

    //getter에 의한 값 획득
    val name = user.name //== String name = user.getName();

    //setter에 의한 값 지정
    user.age = 41 // == user.setAge(41);

    println("name: $name, ${user.age}")
}