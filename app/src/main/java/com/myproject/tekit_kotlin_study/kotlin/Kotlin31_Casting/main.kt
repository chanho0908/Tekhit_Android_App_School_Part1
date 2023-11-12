package com.myproject.tekit_kotlin_study.kotlin.Kotlin31_Casting

fun main() {
    // 객체 생성
    
}

open class SuperClass1{
    fun superMethod1(){
        println("SuperClass1의 superMethod1 입니다")
    }
}

interface Inter1{
    fun interMethod1()
}

class SubClass2 : Inter1{
    fun subMethod2(){
        println("SubClass2의 subMethod2 입니다")
    }

    override fun interMethod1() {
        println("SubClass2의 interMethod1 입니다")
    }
}