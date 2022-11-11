package com.junga.mypractice

// 4. Object

//Singletone Pattern
object CarFactory { //첫 컴파일 때 만들어지는 인스턴스 딱 하나
    val cars : MutableList<Car> = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }

}

data class Car(val horsePower : Int)

fun main() {
    val car : Car = CarFactory.makeCar(10)
    val car2 : Car = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}