package com.junga.mypractice

/* 1.Lamda : value 처럼 다룰 수 있는 익명함수
     1) 메소드의 파라미터로 넘겨줄 수 있음. fun maxBy(a : Int), a(파라미터)에 function 삽입 가능
     2) return 값으로 사용 가능(function도 return가능) */

/* 람다의 기본 정의
 - val lamdaName : Type = {argumentList -> codeBody}
   선언  람다이름  :  타입 = {   파라미터   ->  코드바디 }
 - 마지막에 있는 코드줄이 리턴값*/



val square : (Int) -> (Int) = {number : Int -> number*number}
//            이것  때문에    =  이것의 타입 추론이 가능

val namdeAge : (String, Int) -> String = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}



// 확장 함수
val pizzaIsGreat : String.() -> String = {
    //this ->String 오브젝트 자체
    this + "Pizza is the best!!" // <=return 값
}

/*fun extendString(name : String, age : int) : Stirng {
    val introduceMyself : String.(Int) -> String = { "I am ${this} and ${it} years old" }
    //this: 확장함수를 부르는 오브젝트, it : 파라미터 하나일때 이용 가능
    return name.introduceMyself(age)
}*/
/*람다의 Return : 마지막줄*/



// 람다의 Return

val calculateGrade : (Int) -> String = {
    //타입 소괄호 필수, 리턴 타입은 하나기 때문에 필요x
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error" //필수
    }
}


//람다를 표현하는 방법
//1) 메소드의 파라미터로 넘겨줄 수 있음

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

//익명 내부 함수 -> 아래 조건 만족 시 람다식을 이용해서 쉽게 표현 가능
/* 버튼에 람다식 사용 가능한 조건
    1. kotlin 인터페이스가 아닌 java 인터페이스이어야 함
    2. 그 인터페이스는 딱 하나의 메소드만 가져야 함
 */





fun main() {
    println(square(12))
    println(namdeAge("noah",99))

    val a = "noah said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    //println(extendString( "ariana",  27))
    println(calculateGrade(97))

    val lamda : (Double) -> Boolean = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    // 람다 리터럴
    println(invokeLamda({it > 3.22}))
    print(invokeLamda({true}))
    invokeLamda { it > 3.22 } // function의 마지막 파라미터가 람다식일때 생략 후 {}사용 가능
}
