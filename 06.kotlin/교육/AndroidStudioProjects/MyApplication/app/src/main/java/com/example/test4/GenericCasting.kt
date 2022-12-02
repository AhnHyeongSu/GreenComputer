package com.example.test4

open class Parent
class Child2: Parent()
class Cup<T>

fun main() {
    val obj1: Parent = Child2() // Parent 형식의 obj1은 Child2로 형 변환될 수 있음

    val obj2: Parent = Parent()
    val obj3: Cup<Child2> = Cup<Child2>()
    val obj4: Cup<Parent> = Cup<Parent>()

    val obj5 = Cup<Child2>()
    val obj6: Cup<Child2> = obj5
}
