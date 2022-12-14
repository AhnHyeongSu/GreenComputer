package com.example.test4

open class Base2 { //최상위 선언 클래스에는 protected를 사용할 수 없음
    protected var i = 1
    protected  fun protectedFunc() {
        i += 1 //접근 허용
    }
    fun access() {
        protectedFunc() //접근 허용
    }
    protected class Nested // 내부 클래스에는 지시자 허용
}

class Derivced : Base2() {
    fun test(base: Base2): Int {
        protectedFunc() //Base 클래스의 메서드 접근가능
        return i //Base2 클래스의 프로퍼티 접근가능
    }
}

fun main() {
    val base = Base2() //생성가능
    //base.i  //접근불가
    //base.protectedFunc() //접근불가
    base.access() //접근가능
}