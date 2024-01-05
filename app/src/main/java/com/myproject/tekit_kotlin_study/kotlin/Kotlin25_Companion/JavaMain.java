package com.myproject.tekit_kotlin_study.kotlin.Kotlin25_Companion;

public class JavaMain {
    // 정적 변수
    public static int a = 100;

    // 정적 메서드
    public static void javaMethod(){
        System.out.println("javaMethod1");
    }

    public static void main(String[] args) {
        // 코틀린에서 정의한 companion Object의 정적 멤버 사용
        TestClass2.Companion.getKotlinValue1();

        TestClass2.Companion.kotlinMethod();
    }
}
