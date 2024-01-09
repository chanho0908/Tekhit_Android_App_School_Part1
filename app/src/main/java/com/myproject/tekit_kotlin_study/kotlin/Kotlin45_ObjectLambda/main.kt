package com.myproject.tekit_kotlin_study.kotlin.Kotlin45_ObjectLambda

// let, apply,run, with, also
// 생성되어 있는 객체의 프로퍼티나 메서드를 사용할 때
// 생성되어 있는 객체의 프로퍼티나 메서드를 사용할 경우
// 혹은 클래스로 부터 객체를 생성할 때 사용한다.

fun main(){

}

class TestClass1(var a1:Int, var a2:Int){
    var a3:Int = 0
    var a4:Int = 0

    fun testMethod1(){
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }


}