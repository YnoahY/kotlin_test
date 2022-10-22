package com.junga.mypractice

fun main() {
    // 4. 조건식
    fun maxBy(a : Int, b : Int) : Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b //:Int 생략 가능
    //3항 연산자 없음 => 대신 위와같이 표현

    fun checkNum(score : Int) {
        when(score) {
            0 -> println("this is 0")
            1 -> println("this is 1")
            2,3 -> println("this is 2 or 3")
            //else -> println("I don't know") => 생략 가능
        }
        var b : Int = when(score) {
            1-> 1
            2-> 2
            else-> 3 //expression은 else 필수
        }
        println("b : ${b}")

        when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("ok")// 생략 갸능

        }
    }
    checkNum(1)
}

//Expression vs Statement
/*Expression: 값을 만들어 리턴함, 표현식 사용, 코틀린의 모든 함수는 expression
* Statement: 명령 지시하는 문장, 값과 리턴값 x*/