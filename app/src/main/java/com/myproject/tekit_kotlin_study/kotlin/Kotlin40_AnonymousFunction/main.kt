package com.myproject.tekit_kotlin_study.kotlin.Kotlin40_AnonymousFunction

fun main(){
    testFunction1()
    // 코틀린은 이름을 가지고 있는 함수를 다른 변수에 담는 것이 불가능하다.
    // val testFunction2 = testFunction1

    // 익명함수 호출
    // 익명함수를 가지고 있는 변수를 통해 호출
    testFunction3()
}

fun testFunction1(){
    println("testFunction1 입니다")
}

// 익명함수
val testFunction3 = fun(){
    println("익명함수입니다")
}