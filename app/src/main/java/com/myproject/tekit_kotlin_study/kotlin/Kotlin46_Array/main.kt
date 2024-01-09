package com.myproject.tekit_kotlin_study.kotlin.Kotlin46_Array
// 배열 : 다수의 기억장소를 하나로 묶어서 관리하는 개념
// 배열은 다수의 기억장소를 하나로 묶어서 관리하고 배열의 주소값을 가지고 있는 변수를 통해
// 배열에 접근하여 배열이 관리하는 기억장소를 사용할 수 있다.

fun main(){
    // 배열 생성
    // 배열이 관리하는 값들을 지정해준다.
    // 지정한 값 만큼의 기억장소가 생성되고 그 기억장소들을 관리하는 배열이 생성된다.
    // 배열이 관리하는 기억장소의 개수는 변경될 수 없다.
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1:  $array1")

    // 배열이 관리하는 값을 모아 문자열로 만들어 반환 받을 수 있다.
    // 이를 통해 객체가 관리하는 값들을 출력해 볼 수 있다.
    println("array1 : ${array1.contentToString()}")

    // 배열은 다양한 타입의 값을 담을 수 있다.
    val array2 = arrayOf(100, 11.11, "문자열", true)
    println("array2 : $array2")
    println("array2 : ${array2.contentToString()}")

    // 특정 타입의 값만 담는 배열을 생성한다.
    // OOOarrayOf
    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)
    val array5 = arrayOf<String>("문자열1", "문자열2", "문자열3")

    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array5 : ${array5.contentToString()}")

    // 주어진 람다식을 지정한 개수만큼 반복한다. 첫 번째 기억장소에 담을 값을 결정하기 위해
    // 람다식을 수행하고 람다식의 제일 마지막에 작성한 값이 첫 번째 기억장소에 담기 된다.
    // 이런식으로 모든 기억장소의 수 만큼 람다식이 수행되고 람다식이 전달하는 값은 각각의 기억장소
    // 담게 된다.

    // 0이 5개 담긴 배열 생성
    val array6 = Array(5){ 0 }
    println("array6 : ${array6.contentToString()}")

    // 람다식에 있는 it 에는 0 부터 1씩 증가되는 값이 들어온다.
    val array7 = Array(5){
        it
    }
    println("array7 : ${array7.contentToString()}")

    // 3 부터 3의 배수 10개를 가지고 있는 배열을 생성한다.
    val array8 = Array(10){
        (it + 1) * 3
    }
    println("array8 : ${array8.contentToString()}")

    // 다차원 배열 생성
    // 배열 안에 배열들이 들어가 있는 것
    val array9 = arrayOf(
        arrayOf(10, 20, 30),
        arrayOf(40, 50, 60),
        arrayOf(70, 80, 90)
    )
    println("array9 : ${array9.contentToString()}")

    println("array9 : ${array9.contentDeepToString()}")

    println("----------------------------------------------------")

    // 배열이 관리하는 기억 장소는 0부터 1씩 증가되는 순서값을 사용한다.
    println("array1[0] : ${array1[0]}")
    println("array1[1] : ${array1[1]}")

    // get 메서드를 이용할 수도 있다. [ ] 연산자를 사용하면 get 메서드를 호출하기 때문에
    // [ ]를 사용한 것과 동일하다.
    println("array1.get(0) : ${array1.get(0)}")
    println("array1.get(1) : ${array1.get(1)}")


}
