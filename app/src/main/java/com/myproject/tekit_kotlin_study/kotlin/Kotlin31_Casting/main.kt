package com.myproject.tekit_kotlin_study.kotlin.Kotlin31_Casting

fun main() {
    // 객체 생성
    // 부모 클래스형 타입에 담는다.
    val obj1:SuperClass1 = SubClass1()
    // 구현한 인터페이스형 타입에 담는다.
    val obj2:Inter1 = SubClass2()

    // 객체의 주소값을 가지고 있는 변수의 타입이 부모클래스 타입이므로
    // 부모가 가지고 있는 메서드이거나 자식에서 overriding한 메서드만 호출할 수 있다.
    obj1.superMethod1()
    // obj1.subMethod1()
    // 객체의 주소값을 가지고 있는 변수의 타입이 구현한 인터페이스 타입이므로
    // overriding한 메서드만 호출할 수 있다.
    obj2.interMethod1()
    // obj2.subMethod2()


}

class SubClass1 : SuperClass1(){
    fun subMethod1(){
        println("SubClass의 subMethod1 입니다")
    }
}

class SubClass2 : Inter1{
    fun subMethod2(){
        println("SubClass2의 subMethod2 입니다")
    }

    override fun interMethod1() {
        println("SubClass2의 interMethod1 입니다")
    }
}

open class SuperClass1{
    fun superMethod1(){
        println("SuperClass1의 superMethod1 입니다")
    }
}

interface Inter1{
    fun interMethod1()
}

