package androidTest

fun main() {
    val data1 = arrayOf<Int>(10, 20, 30)
    println(
        """
            array size : ${data1.size}
            array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """.trimIndent()
    )
}

/*arrayOf()
* 배열 선언시 값 할당 가능
*/

/*size
* java의 length와 동일
* 배열의 길이 반환
*/