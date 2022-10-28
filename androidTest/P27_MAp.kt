package androidTest

fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size: ${map.size}
            map data: ${map.get("one")}, ${map.get("two")}}
        """.trimIndent()
    )
}

/*List, Set, Map
* List: 순서 있는 데이터 집합, 데이터 중복 허용
* Set: 순서 없는 데이터 집합, 데이터 중복 불허
* Map: key, value로 이루어짐, 순서 없음, key 중복 불허*/

/*Collection 타입 클래스
* 불변 클래스: 초기 대이터 대입시 더이상 변경 불가
* 가변 클래스: 초기값 대입 후 데이터 추가,변경 가능*/


/*Map
* 객체 -> key, value로 이루어짐
* 객체의 키와 값은 Pair객체(key,value), 'key to value' 이용 가능*/