package com.myproject.tekit_kotlin_study.kotlin.fristproject

import java.util.ArrayList
import java.util.Scanner

fun main() {


}

private class CarFactory{
    val carList = ArrayList<Car>()

    private fun makeCar(){
        repeat(3) { carList.add(PassengerCars()) }

        repeat(3){ carList.add(Truck()) }

        repeat(4){ carList.add(ElectricCar()) }
    }

    private fun inputCarInfo(){
        for(i in 1..10){
            carList[i].inputCarInfo()
        }
    }

    private fun printCnt(): Int{
        return 0
    }
}


private open class Car(var carType: String){
    private lateinit var tireCnt: String
    private lateinit var seatCnt: String
    val sc = Scanner(System.`in`)

    private fun moveForward(){
        println("${carType}이 주행 합니다.")
    }

    private fun backward(){
        println("${carType}이 후진 합니다.")
    }

    fun inputCarInfo(){
        println("타이어 개수를 입력해 주세요 : ")
        tireCnt = sc.next()
        println("좌석 개수를 입력해 주세요 : ")
        seatCnt = sc.next()
    }
}

private class PassengerCars: Car("승용차"){
    private lateinit var carSeat: String

    private fun inputCarSeat(){
        carSeat = sc.next()
    }

    private fun playLullaby() = println("자장 자장 우리 아가~")
}

private class Truck: Car("트럭"){
    private lateinit var capacity: String

    private fun inputCapacity(){
        capacity = sc.next()
    }

    private fun loadGoods() = println("어이~ 김씨 와서 돌좀 날라")
}

private class ElectricCar: Car("전기자동차"){
    private lateinit var battery: String

    private fun inputBattery(){
        battery = sc.next()
    }

    private fun charging() = println("삐까츄우우우우우")
}