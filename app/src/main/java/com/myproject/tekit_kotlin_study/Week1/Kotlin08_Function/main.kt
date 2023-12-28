package com.myproject.tekit_kotlin_study.Week1.Kotlin08_Function

// 함수 : 코드를 관리하는 요소
// 개발자가 필요할 때 함수가 관리하는 코드를 동작시킬 수 있다.
// 함수가 관리하는 코드를 동작시키기 위해 명령하는 것을 함수를 호출한다고 부른다.

// 프로그램 코드는 항상 위에서 아래로 흘러간다.
// 코드가 흘러가다가 함수를 호출하게 되면 코드의 흐름이 함수쪽으로 이동하고
// 함수 내부의 코드가 위에서 아래방향으로 모두 수행되면 코드의 흐름이 함수를
// 호출한 쪽으로 돌아온다.

// 함수의 사용
// 1. 프로그램에서 자주 사용하는 코드가 있다면 함수로 만들어서 사용한다.
// 2. 프로그램을 구성하는 다양한 기능들을 각각 함수로 만들어서 관리한다.

fun main(){
    println("main의 코드가 수행 중입니다")
    // 함수를 호출한다.
    test1()
    println("main의 코드가 수행 중입니다")

    // 매개변수를 가지고 있는 함수 호출
    test2(100, 11.11)
    test2(200, 22.22)

    // 함수를 호출할 때 전달하는 값을 어떤 매개변수에 저장할지 정할 수 있다.
    // 첫 번째 값은 a2를 지정했기 때문에 두 번째 매개변수인 a2에 첫 번째 값이 저장된다.
    // 두 번째 값은 a1을 지정했기 때문에 첫 번째 매개변수인 a1에 두 번째 값이 저장된다.
    test2(a2=33.33, a1=300)

    // 전달하는 값과 매개변수의 타입이 맞지 않는 경우
    // 전달하는 값과 매개변수의 타입이 일치하지 않으면 오류가 발생한다.
    // test2(44.44, 44.44)

    // 전달하는 값의 개수와 매개변수의 값이 다를 경우
    // 오류가 발생한다.
    // test2(500)
    // test2(600, 66.66, true)

    // 전달하는 값의 개수와 매개변수의 값이 다를 경우
    // 오류가 발생한다.
    // 아래의 코드는 함수가 가지고 있는 매개변수의 개수보다
    // 더 적은 값을 전달했기 때문이 아니라 매개변수에 저장될 값이
    // 모두 결정되지 않았기 때문에 오류가 발생한다.
    // test2(500)
    // 매개변수의 개수보다 더 많이 전달했기 때문에 오류가 발생한다.
    // test2(600, 66.66, true)

    // 매개변수에 기본값이 설정되어 있는 함수 호출
    // a2와 a3에는 기본값이 설정되어 있지만 함수 호출시 값을 전달하고 있기 때문에
    // 기본값은 무시되고 전달해주는 값이 저장된다.
    test3(200, 22.22, "새로운 문자열")
    // a2와 a3에 저장된 값을 전달하지 않았으므로 기본값이 a2와 a3에 저장된다.
    test3(300)

    // 만약 기본값을 저장하고 싶은 매개변수가 중간에 있다면...
    test3(400, a3="새로운 문자열3")
}

// 기본 함수
// fun 함수이름(){
//  관리할 코드들
// }
fun test1(){
    println("test1함수 호출")
    println("test1함수 내부의 코드가 끝났습니다")
}

// 함수의 매개변수
// 함수 내부의 코드가 수행되기 위해 필요한 데이터 중에
// 함수를 호출하는 쪽에서 데이터를 가지고 있다면
// 함수를 호출할 때 전달할 수 있고 전달된 값은
// 함수의 매개변수에 담기게 된다.

fun test2(a1:Int, a2:Double){
    println("test2 함수 호출")
    println("a1 : $a1")
    println("a2 : $a2")
}

// 기본값을 가지고 있는 매개변수
// 매개변수에 기본값이 설정되어 있는 경우
// 매개변수에 저장될 값이 전달되지 않으면 기본값이 저장된다.
// 만약 기본값이 설정되어 있지 않는 매개변수가 있다면
// 함수 호출시 무조건 값을 전달해줘야 한다
fun test3(a1:Int, a2:Double=11.11, a3:String="기본문자열"){
    println("test3 함수 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("a3 : $a3")
}
