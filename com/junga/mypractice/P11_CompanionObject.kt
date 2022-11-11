package com.junga.mypractice

// 3. Companion object : java의 static 대신 사용, 정적 변수나 정적 메소드 선언시 사용

class Book private constructor (val id : Int, val name : String) {
    companion object BookFactory : IdProvider
    {
        override fun getId(): Int {
            return 444
        }

        val myBook = "new Book"
        fun create() = Book(0, myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}


fun main() {
    val book = Book.create()
    //val book = Book.companion.create() => companion 생략 가능

    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
}

