package com.myproject.tekit_kotlin_study.Week1.Kotlin12_Loop

// 반복문
// 코드의 일부분을 반복하고자 할 때 사용한다.
// for : 데이터를 관리하는 요소를 가지고 반복하고자 할 때
//       반복 횟수가 결정되어 있을 때
//       반복에 대한 최소 최대 범위가 결정되어 있다.
// while : 반복할 조건 혹은 반복을 중단할 조건이 있을 때 사용
// do while : 반복할 조건 혹은 반복을 중단할 조건이 있을 때 사용

fun main(){

    // 숫자1..숫자2 : 숫자1 부터 숫자2 까지 1씩 증가되는 값을 관리하는 요소를 만들어준다.
    println((1..10).toList())
    // 숫자1 until 숫자2 또는 숫자1 .. <숫자2 : 숫자1 부터 숫자2 - 1 까지 1씩 증가되는 값을 관리하는 요소를 만들어준다.
    println((1 until  10).toList())
    // step : step 을 지정하면 증가폭을 설정할 수 있다.
    println((1..10 step 2).toList())
    // downto : 1씩 감소되는 값을 관리할 수 있는 요소를 만들 수 있다.
    println((10 downTo 1).toList())
    // downTo 도 step을 설정하면 감소 폭을 설정할 수 있다.
    println((10 downTo 1 step 2).toList())

}