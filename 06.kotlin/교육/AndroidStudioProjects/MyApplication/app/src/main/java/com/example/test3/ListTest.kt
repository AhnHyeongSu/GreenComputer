package com.example.test3

//fun main() {
//    var list = listOf<Int>(10, 20, 30)
//    println(
//        """
//            list size : ${list.size}
//            list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
//        """
//    )
//}

fun main() {
    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)
    mutableList.add(0, 50)
    println(
        """
            list size : ${mutableList.size}
            list data : ${mutableList[0]}, ${mutableList.get(1)}, 
                        ${mutableList.get(2)}, ${mutableList.get(3)}
        """
    )
}