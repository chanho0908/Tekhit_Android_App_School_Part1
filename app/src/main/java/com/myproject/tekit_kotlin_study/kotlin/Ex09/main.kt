package com.myproject.tekit_kotlin_study.kotlin.Ex09
// EX09) 1부터 1씩 증가시키는 값 중 3의 배수이거나 7의 배수인 숫자를 누적한다. 누적값이
// 10000이상이 됬을 때의 숫자가 몇인지 출력한다.
fun main(){
    var answer = 0
    var x = 1;

    while (answer < 10000){
        if(x % 3 == 0 || x % 7 == 0) answer += x
        x++
    }

    println("최대값 : ${x-1} , 누적합 : $answer")

}

