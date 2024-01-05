package com.myproject.tekit_kotlin_study.kotlin.Ex.Ex08

import java.util.Scanner

//EX08) 사용자에게 정수를 입력받아 누적한다. 사용자가 0을 입력하면 입력을 중단하고
//그때까지의 총합을 출력한다.

fun main(){
    val sc = Scanner(System.`in`)
    var answer = 0

    while (true){
        val x = sc.nextInt()
        println("x: $x")
        if (x == 0) break
        answer += x
    }

    println(answer)
}