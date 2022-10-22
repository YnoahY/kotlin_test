package com.junga.mypractice

fun main() {
    //2. val var
    /* val = value = 상수
     * var = variable = 변수
    */

    fun hi() {
        val a: Int = 10 //상수
        var b: Int = 9 //변수

        b = 100
        /* 선언 시 주의 사항
        - var e => x
        - var e : String => 반드시 타입명 표기 해줄 것
        */

        val c: Int = 10
        //val c (: Int => 생략가능) = 10
        var d = 100

        var name = "noah"
        //var name (: String => 생략가능)= "noah"
        /* 자동으로 추론을 하기 때문에 타입은 보통 생략해서 사용 */
    }

}