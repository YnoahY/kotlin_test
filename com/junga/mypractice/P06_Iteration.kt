package com.junga.mypractice
// 6. 반복문 : For / While
fun main() {
    forAndWhile()
}
    fun forAndWhile() {
        val students : ArrayList<String> = arrayListOf("noah","jayce","jenny","james","jennifer")
        for ( name : String in students) {
            println("${name}")
        }

        for ((index : Int , name : String) in students.withIndex()) {
            println("${index+1}번째 학생 : ${name}")
        }

    var sum : Int = 0 //초기값
        for ( i : Int in 1..10 step 2) { //step: 증가값을 변경, step에 들어간 변수는 const로 값이 고정
        //for ( i : Int in 10 downTo 1) { //10부터 차례로 내려가는 값 출력
        //for ( i : Int in 1 until 100 { // until : 100미포함 =>99번 반복/ ..의 경우 100포함 => 100번 반복
            sum +=  i // sum = sum + i
         }
        println(sum)

        //while
        var index = 0
        while(index < 10) {
            println("current index : ${index}")
            index++
        }
    }


