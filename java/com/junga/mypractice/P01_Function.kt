package com.junga.mypractice

fun main() {
//1.함수
    helloWorld()

    println(add(4, 5))
}

    fun helloWorld() {
        //fun helloWorld() : Unit { : return type이 없으면 : Unit 생략해도 무관
        println("Hello world!")
    }

    fun add(a: Int, b: Int) : Int {
        //변수명: 변수타입     //return할 때, 반드시 리턴 타입 지정해야함
        return a+b
    }



