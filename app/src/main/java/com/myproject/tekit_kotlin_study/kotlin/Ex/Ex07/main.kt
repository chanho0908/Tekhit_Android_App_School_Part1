package com.myproject.tekit_kotlin_study.kotlin.Ex.Ex07

import java.util.Scanner

//EX07) 사용자에게 정수를 입력받고 1 부터 입력 받은 숫자까지의 총합을 구한다

fun main(){
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    println(getSum(input))
}

fun getSum(n: Int): Int{
    var answer = 0;
    for(x in 1..n){
        answer += x
    }

    return answer
}
