fun main() {
    //println("안형수")

    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    println("str1 == str2: ${str1 == str2}") //힙영역에 "Hello"값을 가진 객체가 있으므로 그 주소를 가져간다
    println("str1 == str3: ${str1 == str3}")
}




