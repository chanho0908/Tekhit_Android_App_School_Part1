package com.myproject.tekit_kotlin_study.kotlin.Ex.Ex14

import java.util.Scanner

//EX14) 동물원..
//동물을 관리하는 프로그램을 작성한다.
//동물은 총 6마리이다.
//호랑이는 이름, 동물종류, 다리 개수로 구성된다.
//사자는 이름, 동물종류, 털 개수로 구성된다.
//여우는 이름, 동물종류, 꼬리 개수로 구성된다.
//
//호랑이는 먹는다, 달린다는 행동을 할 수 있다.
//사자는 먹는다, 염색한다라는 행동을 할 수 있다.
//여우는 먹는다, 유혹한다라는 행동을 할 수 있다.
//
//프로그램이 시작되면 호랑이 두마리, 사자 두마리, 여우 두마리 순서대로 입력을 받는다.
//
//입력시 동물종류는 입력받지 않는다.
//
//모든 동물의 정보가 입력이 완료되면
//호랑이는 먹는다와 달린다는 행동을 하게 하고
//사자는 먹는다와 염색한다라는 행동을 하게 하고
//여우는 먹는다와 유혹한다라는 행동을 할하게 한다
//
//그 이후, 모든 동물들의 정보를 출력한다.

fun main(){
    val manager = ZooManager()
    manager.inputAnimalInfo()

    manager.doAnimal()

    manager.printAnimalInfo()
}

class ZooManager{
    val tiger1 = Tiger()
    val tiger2 = Tiger()
    val lion1 = Lion()
    val lion2 = Lion()
    val foxy1 = Foxy()
    val foxy2 = Foxy()

    fun inputAnimalInfo(){
        tiger1.inputTigerInfo()
        tiger2.inputTigerInfo()
        lion1.inputLionFur()
        lion2.inputLionFur()
        foxy1.inputFoxyTail()
        foxy2.inputFoxyTail()
    }

    fun printAnimalInfo(){
        tiger1.printInfo()
        tiger2.printInfo()
        lion1.printInfo()
        lion2.printInfo()
        foxy1.printInfo()
        foxy2.printInfo()
    }

    fun doAnimal(){
        tiger1.doRun()
        tiger2.doRun()
        lion1.doDyeing()
        lion2.doDyeing()
        foxy1.doEnsnare()
        foxy2.doEnsnare()
    }
}

open class Zoo(var kind: String){
    var name = ""
    val sc = Scanner(System.`in`)

    fun inputInfo(){
        println("이름을 입력하세요 : ")
        name = sc.next()
    }
}

class Tiger: Zoo("호랑이"){
    var legsCnt = 0

    fun doRun(){
        println("${kind}가 달린다 !!")
    }

    fun inputTigerInfo(){
        inputInfo()
        println("${kind}의 다리 개수를 입력하세요 : ")
        legsCnt = sc.nextInt()
    }

    fun printInfo(){
        println("${kind}의 다리는 ${legsCnt}개 입니다람쥐")
    }
}

class Lion: Zoo("사자"){
    var furCnt = 0

    fun doDyeing(){
        println("${kind}가 염색한다 !!")
    }

    fun inputLionFur(){
        inputInfo()
        println("${kind}의 털 개수를 입력하세요 : ")
        furCnt = sc.nextInt()
    }

    fun printInfo(){
        println("${kind}의 털은 ${furCnt}개 입니다람쥐")
    }
}

class Foxy: Zoo("여우"){
    var tailCnt = 0

    fun doEnsnare(){
        println("${kind}가 유혹한다 !!")
    }

    fun inputFoxyTail(){
        inputInfo()
        println("${kind}의 꼬리 개수를 입력하세요 : ")
        tailCnt = sc.nextInt()
    }

    fun printInfo(){
        println("${kind}의 꼬리는 ${tailCnt}개 입니다람쥐")
    }


}