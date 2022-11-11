package com.junga.mypractice

fun main() {
    // 3. String 탬플릿
    val name1 = "noah"
    val lastName = "song"
    println("my name is $name1")
    //변수 출력 : $ => 띄어쓰기 전까지 변수로 인식
    println("my name is ${name1 + lastName} I'm 25")
    //변수 영역 지정 : ${} => 중괄호로 변수 영역 지정
    println("this is 2\$A")
    //$출력 => \$

}