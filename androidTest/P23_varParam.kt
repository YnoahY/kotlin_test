package androidTest

fun print3Numbers(num1: Int, num2: Int, num3: Int) {
    //num1, num2, num3을 각각 출력
}
fun print4Numbers(num1: Int, num2: Int, num3: Int,num4: Int) {
    //num1, num2, num3, num4를 각각 출력
}


fun main(args:Array<String>) {
    //(args:Array<String>) : 생략되어있던 구문, stack영역에 0으로 맨 아래 깔려있던것
    normalVarargs(1, 2, 3, 4) //4개의 인자 구성
    normalVarargs(4, 5, 6) //3개의 인자 구성
}

fun normalVarargs(vararg counts: Int) {
    //vararg : 가변적 매개변수, 들어오는 값 공간 생성하며 대입
    for (num in counts) {
        println("$num")
/*
* array아님을 주의
* 논리 적으로 연속된 공간처럼 보일 뿐, 물리적으로는 각각 떨어져있다.
* 그때그때 잉여메모리로 남는곳을 차지함
=>  index가 아닌 포인터로 가리키며 순서 정렬
*/
    }
    print("\n")
}