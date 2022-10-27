package androidTest

fun main() {

val a : Int = 1
//val b: Double = a => 자료형 불일치
//val c: Int = 1.1 => 자료형 불일치


//변환 메서드 이용
val b: Double = a.toDouble()

//표현식에서 자료형 자동 변환
val result = 1L + 3 //Long + Int -> result는 Long

}

/* 자료형 비교, 검사, 변환
 toByte: Byte
 toLong: Long
 toShort: Short
 toFloat: Float
 toInt: Int
 toDouble: Double
 toChar: Char
* */