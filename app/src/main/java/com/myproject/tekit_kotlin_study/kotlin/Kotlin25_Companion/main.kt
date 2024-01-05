package com.myproject.tekit_kotlin_study.kotlin.Kotlin25_Companion

import com.myproject.tekit_kotlin_study.kotlin.Kotlin25_Companion.TestClass1.Companion.testMethod2

// 정적 맴버
// 변수인 경우에는 프로그램 전체에서 딱 하나만 만들어 사용하는 변수를 의미한다.
// 정적 맴버는 객체 생성 없이 바로 사용하는 요소이다.
// 하지만 딱 하나만 생성되기 때문에 객체의 맴버로 취급되지 않는다.

// Java 언어에서는 static라는 것을 사용한다.

fun main(){
    // 일반 맴버 변수는 객체를 생성할 때 마다 계속 속성된다.
    val t1 = TestClass1(100)
    val t2 = TestClass1(200)
    println("t1.a1 : ${t1.a1}")
    println("t2.a1 : ${t2.a1}")

    t1.a1 = 1000
    println("t1.a1 : ${t1.a1}")
    println("t2.a1 : ${t2.a1}")

    // 정적 맴버는 객체를 생성하지 않고 사용한다.
    // 클래스명.맴버이름
    println("TestClass1.a2 : ${TestClass1.a2}")
    TestClass1.testMethod2()
}

class TestClass1{
    // 일반 멤버 변수

    var a1: Int

    constructor(a1: Int){
        this.a1 = a1
    }

    // 정적 맴버 정의
    companion object{
        // 정적 맴버 변수
        var a2:Int = 100

        fun testMethod2(){
            println("testMethod2 - a2 : $a2")
        }
    }
}
