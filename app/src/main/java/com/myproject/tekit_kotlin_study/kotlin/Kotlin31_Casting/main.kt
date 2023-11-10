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

    // as : 객체의 주소값을 가지고 있는 변수의 타입을 다른 클래스 타입으로 변환한다.
    println("-----------------------------------------------")

    // obj1 의 타입을 SubClass1로 변환하고 obj1 에 담긴 값을 obj3에 넣어준다.
    val obj3 = obj1 as SubClass1
    obj1.superMethod1()
    obj1.subMethod1()

    obj3.superMethod1()
    obj3.subMethod1()

    // 위의 클래스는 obj1 에 SubClass1을 가지고 만든 객체의 주소값이 담겨져 있기 때문에 가능한 것이다.
    // 만약 다른 클래스타입으로 변환을 할 경우 오류가 발생한다.
    // ClassCastException
    // val obj4 = obj1 as String

    // is : 객체를 생성했을 때 사용했던 클래스가 무엇인지 확인할 수 있다.
    // 또한, 객체를 생성했을 때 사용했던 클래스의 부모클래스도 확인할 수 있다.
    // 의미는 객체에 지정한 클래스 부분이 있는지를 확인하는 것이다.

    val obj5 = SuperClass1()
    val chk1 = obj5 is SubClass1
    val chk2 = obj5 is SuperClass1
    val chk3 = obj5 is Inter1

    println("chk1 : $chk1")
    println("chk2 : $chk2")
    println("chk3 : $chk3")

    // 스마트 캐스팅 : 특정 조건을 만족하면 자동으로 형변환이 이루어지는 것을 의미한다.
    val obj6:SuperClass1 = SubClass1()
    // SubClass1 부분이 있는지 검사한다.
    // 아래와 같이 객체에 특정 클래스 부분이 있는지를 검사하는 코드는
    // 해당 타입으로 형변환 한 다음에 메서드나 프로퍼티를 호출하려고 하는 경우가 많다.
    // 이제 코틀린은 검사 대상 타입으로 변환까지 해준다.
    // obj6.subMethod1()

    if(obj6 is SubClass1){
        obj6.subMethod1()
    }
    // 위의 if 문이 끝나면 원래의 타입으로 돌아온다.
    // obj6.subMethod1()
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

fun anyFunction(obj: Any){
    // is 를 통해 클래스타입을 확인하고
    // 스마트 캐스팅을 이용해 메서드를 호출할 수 있다.
    if (obj is SubClass1) obj.subMethod1()
    if (obj is SubClass2) obj.subMethod2()
    if (obj is String) println("문자열 입니다.")
}

