package com.myproject.tekit_kotlin_study.kotlin.Ex02

import java.util.Scanner

// 키보드에서 입력받아 짝수면 짝수입니다 홀수면 홀수입니다 출력
fun main(){
    println("숫자를 입력해주십쇼~")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt() % 2

    when(n){
        0 -> println("짝수 입니다.")
        else -> println("홀수 입니다.")
    }
}