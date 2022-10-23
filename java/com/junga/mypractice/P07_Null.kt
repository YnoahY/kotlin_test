package com.junga.mypractice

fun main() {
    nullcheck()
}
//7. Nullable / NotNull
    fun nullcheck() {
        //NPE: Null pointer Exception

        var name : String = "noah" //타입명 생략 가능, 기본적으로 NotNull
        var nullName : String? = null //타입명 뒤에 ?붙으면 Nullable 타입으로 변환

        var nameInUpperCase : String = name.toUpperCase() //notNull
        var nullNameInUpperCase : String? = nullName?.toUpperCase()
        //받은 값이 null이 아니면 uppercase 실행, null일때때전체 null 반환

        // ?:(엘비스 연산자)  ?:의 왼쪽 객체가 non-null이면 그 객체의 값이 리턴되고, null이라면 ?:의 오른쪽 값을 리턴
        // val lastname : String? = null //null일수 있는 타입은 ? 반드시 붙일 것
        val lastname : String? = "hong"
        val fullName : String = name + " "  + (lastname?: "NO lastName")
            println(fullName)
    }
        //!! : null 값이 아니라는 것을 보증 => 지양
        fun ignoreNulls(str : String?) {
            val mNotNull : String = str!!
            val upper:String = mNotNull.toUpperCase()//null들어갈 시 nullPointException 발생

            val email : String? = "noah@test.com"
            // let: 자신의 리시브 객체를 람다식 내부로 옮겨서 실행
            email.let {
                println("my email is ${email}")
            }
   }
