package com.myproject.tekit_kotlin_study.kotlin.Kotlin05_Literal

fun main(){
    // 정수(4 byte or 8 byte)
    // 자바의 경우 정수값을 작성하면 4 byte 기억공간이 마련되기 때문에
    // 범위를 벗어난 값을 작성하면 오류가 발생한다.
    // 따라서 8 byte 기억공간이 만들어 질 수 있도록 L 을 뒤에 붙혀줘야 한다
    println(2147483648L)
    println(-2147483649L)

    // 그런데 코틀린의 경우 L 붙히지 않더라도 작성된 값을 보고
    // Java 코드로 변환될 때 4 byte 면 충분한 경우 정수값 기대로 유지되고
    // 8 byte 기억공간이 필요한 값이라면 뒤에 L 을 붙힌 코드로 변경된다.
    // 즉 코틀린은 정수값을 작성할 때 값의 범위를 보고 뒤에 L 을 붙혀주지 않아도 된다.
    println(2147483648)
    println(-2147483649)

    // 정수값을 작성할 때 자릿 구분을 위해 _ 를 사용할 수 있다.
    // _ 를 작성했다고 하더라도 그냥 정수값이다.
    println(123_456_789)

    // 실수 (8byte)
    println(11.11)
    // 실수 (4byte)
    println(11.11F)

    // 문자(2byte ?, 실행되는 시스템에 따라간다)
    // 내부적으로 정수값으로 관리된다.
    println('A')
    println('가')

    // 문자열(작성한 글자 수 만큼 메모리를 사용한다. 객체라는 것으로 관리된다)
    println("문자열")

    // 논리 타입(1byte)
    // 참을 의미
    println(true)
    // 거짓을 의미
    println(false)

    // RawString
    // 여러 줄의 문자열을 표현할 때 사용한다.
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())
}