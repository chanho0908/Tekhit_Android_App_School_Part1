package com.myproject.tekit_kotlin_study.kotlin.Kotlin35_Reflection

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

// Reflection : 프로그램 실행 중에 객체에 대한 다양한 정보를 파악할 수 있다.

fun main(){
    // 클래스 타입
    // 코틀린에서의 클래스
    val a1: KClass<String> = String::class
    println("String의 클래스 이름(코틀린) : $a1")
    // 자바에서의 클래스
    val a2:Class<String> = String::class.java
    println("String의 클래스 이름(자바) : $a2")

    // 변수를 통해 접근할 수 있는 객체의 클래스 타입을 파악한다.
    val str1 = "안녕하세요"
    val a3:KClass<out String> = str1::class
    println("str1을 통해 접근할 수 있는 객체의 클래스 타입(코틀린) : $a3")

    val a4:Class<out String> = str1::class.java
    println("str1을 통해 접근할 수 있는 객체의 클래스 타입(자바) : $a4")

    val test1 = TestClass(100, 200,300)

    val a5 = test1::class
    val a6 = test1::class.java
    println("test1의 클래스 타입(코틀린) : $a5")
    println("test1의 클래스 타입(자바) : $a6")

    println("===============================")

    // 클래스 정보 분석
    println("추상 클래스 인가 : ${test1::class.isAbstract}")
    println("Companion 인가 : ${test1::class.isCompanion}")
    println("Data 클래스 인가 : ${test1::class.isData}")
    println("Final 클래스 인가 : ${test1::class.isFinal}")
    println("open 클래스 인가 : ${test1::class.isOpen}")
    println("중첩 클래스 인가 : ${test1::class.isInner}")
    println("Sealed 클래스 인가 : ${test1::class.isSealed}")

    // 생성자 정보
    // 생성자의 정보를 가지고 있는 객체가 리스트에 담겨져서 전달된다.
    val constructors = test1::class.constructors
    println(constructors)

    for(con in constructors){
        println("생성자 : $con")

        // 생성자의 매개 변수 목록을 가져온다.
        for(param in con.parameters){
            println("매개변수 순서 : ${param.index}")
            println("매개변수 타입 : ${param.type}")
            println("매개변수 이름 : ${param.name}")
        }
    }
    println("===================================")
    // 주생성자
    val primaryCon = test1::class.primaryConstructor
    // 없으면 null이 반환된다.
    if(primaryCon != null){
        println("주 생성자 : $primaryCon")

        // 주 생성자의 매개변수들
        for(param in primaryCon.parameters){
            println("매개변수 순서 : ${param.index}")
            println("매개변수 타입 : ${param.type}")
            println("매개변수 이름 : ${param.name}")
        }
    }

    // 프로퍼티
    val properties = test1::class.declaredMemberProperties
    for(prop in properties){
        println("프로퍼티 이름 : ${prop.name}")
        println("프로퍼티 타입 : ${prop.returnType}")
    }

    // 메서드
    val methods = test1::class.declaredMemberFunctions
    for(met in methods){
        println("메서드 이름 : ${met.name}")
        println("메서드 반환타입 : ${met.returnType}")
        println("메서드의 매개변수들 : ${met.parameters}")
    }
}

class TestClass(var number1:Int, var number2:Int, var number3:Int){

    var number4:Int = 0
    var number5:Int = 0

    constructor(a1:Int) : this(100, 200, 300)

    constructor(a1:Int, a2:Int) : this(100, 200, 300)

    fun testMethod1(){}
    fun testMethod2(a1:Int, a2:Int){}
}