package com.junga.mypractice

// 2.Data Class : 데이터 담는 클래스

// pojo class : 어떤 모델이 되는 클래스 - 비어있는 틀 역할을 함

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(). hashCode(), equals(), copy() => 자동생성됨

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

class Ti


fun main() {
    val ticketA = Ticket(  "koreanaAir", "noah",  "2022-11-15",  14)
    val ticketB = TicketNormal(  "koreanaAir", "noah",  "2022-11-15",  14)

    println(ticketA)
    println(ticketB)//메모리 주소 값 나옴
}