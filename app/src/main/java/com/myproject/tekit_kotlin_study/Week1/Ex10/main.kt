package com.myproject.tekit_kotlin_study.Week1.Ex10
// EX10) 철수가 저금을 한다. 첫날 100원을 저금한다. 두번째 날 부터는 전날 잔고액의 3배를
// 저금한다. 1일차 부터 30일차까지의 통장 잔고액을 모두 출력한다.
// 1일차 : 100원
// 2일차 : 400원
// 3일차 : 1600원
//..
// 30일차 : 0000원
//조건 : 변수는 Int 타입의 변수만 사용한다.
fun main(){
    var answer = 100
    println(Integer.MAX_VALUE)
    for (i in 2..30){
        println(answer)
        answer += answer*3
    }

    //println(answer)
}