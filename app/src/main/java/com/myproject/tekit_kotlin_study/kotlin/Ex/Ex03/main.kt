package com.myproject.tekit_kotlin_study.kotlin.Ex.Ex03

import java.util.Scanner

// 주민등록 번호를 입력 받아 다음과 같이 출력한다
// 주민 등록 번호는 - 없이 13자리의 숫자를 입력 받는다.
// 처음 두자리는 생년을 의미한다.
// 세번째 네번째는 생월을 의미한다.
// 다섯번째 여섯번째는 생일을 의미한다.
// 일곱번째 숫자는 다음과 같다.
// 9 : 1800년대생 남성
// 0 : 1800년대생 여성
// 1 : 1900년대생 남성
// 2 : 1900년대생 여성
// 3 : 2000년대생 남성
// 4 : 2000년대생 여성
// 5 : 1900년대생 외국인 남성
// 6 : 1900년대생 외국인 여성
// 7 : 2000년대생 외국인 남성
// 9 : 2000년대생 외국인 여성

// 출력은 다음과 같이 한다

// 1999년 10월 21에 태어난 남성입니다
fun main() {
    println("주민등록번호를 입력해주십쇼~")
    val sc = Scanner(System.`in`)
    val input = sc.next()

    val year = checkEra(input) + input.substring(0,2)
    val month = input.substring(2,4)
    val day = input.substring(4,6)

    print("${year}년 ${month}월 ${day}에 태어난 ${checkGender(input)}입니다.")
}

fun checkEra(input: String):String = when(input.toCharArray()[6]) {
    '1', '2', '5', '6' ->  "19"
    '3', '4', '7', '8' ->  "20"
    else ->  "18"
}

fun checkGender(input: String):String = when(input.toCharArray()[6]) {
    '1', '3', '9' -> "남성"
    '0', '2', '4' -> "여성"
    '5', '7' ->  "외국인 남성"
    else -> "외국인 여성"
}



