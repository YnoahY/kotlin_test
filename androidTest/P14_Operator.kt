package androidTest

fun main() {

//산술 연산자
    var n =0
    if((n%2) == 1) {
        println("n is an Odd number")
    }
    if((n%2) == 0) {
        println("n is an Even number")
    }

//대입 연산자
    var num = 0
    num = num + 2 //=> num = (num) + 2 => num =+ 2
    //=> 연산자 우선순위로 인해 +가 더 앞으로 나옴
    num += 2


//논리 연산자
    var check = (5>3) && (5>2)
    check = (5>3) || (2>5)
    check = ! (5>3)

}


