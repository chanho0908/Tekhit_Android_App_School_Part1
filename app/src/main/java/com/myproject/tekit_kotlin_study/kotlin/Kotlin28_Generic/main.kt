package com.myproject.tekit_kotlin_study.kotlin.Kotlin28_Generic
// Generic : 클래스를 작성할 때 프로퍼티, 매개변수 등에 설정되는 자료형을 객체를 생성할 때
// 결정할 수 있도록 하는 개념

fun main() {

}

// < > : 안에 알바벳 문자를 넣어준다. 보통 대문자 한글자를 작성한다.
// 이 알파벳은 아직 결되지 않은 타입을 의미한다.
// 어떠한 타입인이 결정되지 않았지만 이 타입의 변수들을 정의하여 클래스를 작성하고
// 향후, 객체를 생성할 때 타입을 결정할 수 있다.
class TestClass1<T>{
    fun testMethod1(a1:T){
        println("a1 : $a1")
    }
}