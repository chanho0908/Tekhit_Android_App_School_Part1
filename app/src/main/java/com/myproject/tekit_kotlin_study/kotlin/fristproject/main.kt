package com.myproject.tekit_kotlin_study.kotlin.fristproject

import java.util.Scanner
import kotlin.collections.ArrayList

fun main() {
    val factory = CarFactory()
    factory.makeCar()
    factory.inputCarInfo()
    factory.printResult()
}

private class CarFactory{

    val carList = ArrayList<Any>()
    val sc = Scanner(System.`in`)
    var passengerCarsCnt =0
    var truckCnt = 0
    var electricCarCnt =0

    var totalTire = 0
    var totalSeat = 0
    var totalCarSeat = 0
    var totalCapacity = 0
    var totalBattery = 0

     fun makeCar(){
         repeat(3){ carList.add(PassengerCars()) }

         repeat(3){ carList.add(Truck()) }

         repeat(4){ carList.add(ElectricCar()) }

    }

    fun inputCarInfo(){

        for (car in carList){
            when(car){
                is PassengerCars -> car.inputCarSeat(sc)
                is Truck -> car.inputCapacity(sc)
                is ElectricCar -> car.inputBattery(sc)
            }
        }
    }

    fun printResult(){
        for (car in carList){
            when(car){
                is PassengerCars -> {
                    passengerCarsCnt++
                    println("car.tireCnt : $car.tireCnt")
                    println("car.tireCnt : $car.seatCnt")
                    totalTire += car.tireCnt
                    totalSeat += car.seatCnt
                    totalCarSeat += car.carSeat
                }
                is Truck -> {
                    truckCnt++
                    println("car.tireCnt : $car.tireCnt")
                    println("car.tireCnt : $car.seatCnt")
                    totalTire += car.tireCnt
                    totalSeat += car.seatCnt
                    totalCapacity += car.capacity
                }
                is ElectricCar -> {
                    electricCarCnt++
                    println("car.tireCnt : $car.tireCnt")
                    println("car.tireCnt : $car.seatCnt")
                    totalTire += car.tireCnt
                    totalSeat += car.seatCnt
                    totalBattery += car.battery
                }
            }
        }

        println(toString())
    }

    override fun toString(): String {
        return "승용차 : ${passengerCarsCnt}대\n" +
                "트럭 : ${truckCnt}대\n" +
                "전기 자동차 : ${electricCarCnt}대\n"+
                "총 타이어의 개수 : ${totalTire}개\n" +
                "총 좌석의 개수 : ${totalSeat}개\n" +
                "총 카시트의 개수 : ${totalCarSeat}개\n" +
                "총 적재량 : ${totalCapacity}kg\n" +
                "총 배터리 용량 : ${totalBattery}mAH"
    }

}

private open class Car(var carType: String){
    var tireCnt: Int = 0
    var seatCnt: Int = 0

     fun moveForward(){
        println("${carType}이 주행 합니다.")
    }

     fun backward(){
        println("${carType}이 후진 합니다.")
    }

    fun inputCarInfo(sc: Scanner){
        println("${carType}의 타이어 개수를 입력해 주세요 : ")

        tireCnt = sc.nextInt()
        println("${carType}의 좌석 개수를 입력해 주세요 : ")
        seatCnt = sc.nextInt()
    }
}

private class PassengerCars: Car("승용차"){
    var carSeat = 0

    fun inputCarSeat(sc: Scanner) {
        super.inputCarInfo(sc)
        println("카시트의 개수를 입력해 주세요!")
        carSeat = sc.nextInt()
    }

    fun playLullaby() = println("자장 자장 우리 아가~")
}

private class Truck: Car("트럭"){
    var capacity = 0

    fun inputCapacity(sc: Scanner){
        super.inputCarInfo(sc)
        println("적재량을 입력해 주세요!")
        capacity = sc.nextInt()
    }

    fun loadGoods() = println("어이~ 김씨 와서 돌좀 날라")
}

private class ElectricCar: Car("전기 자동차"){
    var battery = 0

    fun inputBattery(sc: Scanner){
        super.inputCarInfo(sc)
        println("배터리의 용량을 입력해 주세요!")
        battery = sc.nextInt()
    }

    fun charging() = println("삐까츄우우우우우")
}