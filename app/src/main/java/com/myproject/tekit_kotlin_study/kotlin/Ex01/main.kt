package com.myproject.tekit_kotlin_study.kotlin.Ex01

import java.util.Scanner

// 키보드에서 입력받아 출력하는 프로그램
// 1. 키보드에서 입력 받기
// 2. 출력하기

fun main(){
    // 키보드로 부터 입력을 받는다.
    val n1 = inputNumber()
    // 출력한다.
    printNumber(n1)
}

// 키보드로 부터 입력받는 기능

// 출력하는 기능

fun printNumber(number:Int){
    println("입력받은 숫자 : $number")
}

fun inputNumber():Int{
    val scanner = Scanner(System.`in`)
    // 키보드로 부터 정수값을 입력받는다.
    val number = scanner.nextInt()
    // 입력받은 값을 반환한다.
    return number
}


