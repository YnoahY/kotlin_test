package androidTest

fun main() {
    val data1: Array<Int> = Array(3, {0})
    data1[0] = 10
    data1[1] = 20
    data1.set(2, 30)

    println(
        """ 
            array size : ${data1.size}
            array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """
        // """ : 문자열 출력
    )
}

/*Array
* 클래스로 표현
* 데이터 접근 방법: 대괄호([]), set(), get()
* */

//array(배열)와 List 차이 찾아볼 것