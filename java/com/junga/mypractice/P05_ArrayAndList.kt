package com.junga.mypractice

fun main() {

}
    // 5. Array and List
    /*Array : 메모리 이미 할당되어 나옴 -> 처음에 크기 지정 해야 함, 기본적으로 Mutable
    * List : 1.List - 값 변경 불가능(읽기 전용)
             2. MutableList - 수정 가능, get, set 있음 : 대표-ArrayList */

    fun array() {
        //arrayOf, listOf => array,list 초기화
        val array : Array<Int> =  arrayOf(1,2,3)
        val list : List<Int> = listOf(1,2,3)
        //여러 타입으로 초기화 가능
        val array2 : Array<Any> = arrayOf(1,"d",3.4f)
        val list2 : List<Any> = listOf(1,"d",11L)

        array[0] = 3
        //list[0] = 0 =>interface, get만 존재, get으로 값을 가져와 넣을 수는 있으나 값 수정은 불가능
        var result : Int = list.get(0)
        
        var arrayList : ArrayList<Int> = arrayListOf<Int>()
        //val 사용해도 됨 : arrayList가 참조하는 주소값은 변하지 않음(값 추가, 제거와 무관)
        //                => 같은 이름 으로 새로운 객체 생성시 참조값 변함 -> 다시 할당 될 수 없음
        arrayList.add(10)
        arrayList.add(20)
        
    }
