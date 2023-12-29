package com.myproject.tekit_kotlin_study.Week1.Kotlin10_IF

fun main(){
    // if 문 : 주어진 조건식의 결과가 true 인 경우에만 관리하는 코드가 수행된다.
// { } 로 묶은 부분을 관리한다.


    val a1 = 10

    if(a1 == 10){
        println("a1은 10입니다")
    }

    if(a1 == 20){
        println("a1은 20입니다")
    }


    // 조건식의 결과가 true이므로 if 문이 관리하는 코드가 수행된다.
    if(a1 == 10){
        println("a1은 10입니다")
    }

    // 조건식의 결과가 false 이므로 if 문이 관리하는 코드가 수행되지 않는다.
    if(a1 == 20){
        println("a1은 20입니다")
    }

    if(a1 == 10){
        println("a1은 10입니다")
    } else {
        println("a1은 10이 아닙니다")
    }

    if(a1 == 20){
        println("a1은 20입니다")
    } else {
        println("a1은 20이 아닙니다")
    }

    // 조건식의 결과가 true 이므로 if 문이 관리하는 코드가 수행되고
    // else 가 관리하는 코드는 수행되지 않는다.
    if(a1 == 10){
        println("a1은 10입니다")
    } else {
        println("a1은 10이 아닙니다")
    }

    // 조건식의 결과가 false 이므로 if 문이 관리하는 코드가 수행되지 않고
    // else 가 관리하는 코드가 수행된다.
    if(a1 == 20){
        println("a1은 20입니다")
    } else {
        println("a1은 20이 아닙니다")
    }

    // 위에서 부터 아래 방향으로 조건식들을 수행하다가 true 인 부분을 만나면
    // 그 부분을 수행하고 밖으로 나간다.
    // 만약 모든 조건 수식의 결과가 false 일 경우 else 가 있으면 else 부분을 수행하고
    // else 부분이 없으면 아무것도 수행하지 않는다.


    if(a1 == 0){
        println("a1은 0입니다")
    } else if(a1 == 10){
        println("a1은 10입니다")
    } else if(a1 == 20){
        println("a1은 20입니다")
    } else {
        println("a1은 0, 10, 20이 아닙니다")
    }

    // 조건식의 결과에 따라 변수에 값을 저장한다.
    var a4 = ""
    var a5 = 10
    if(a5 == 10){
        a4 = "10 입니다"
    } else {
        a4 = "10이 아닙니다"
    }
    println("a4 : $a4")

    print(test("a"))
}

fun test(a: String): Int = if (a == "b") 1 else 0



