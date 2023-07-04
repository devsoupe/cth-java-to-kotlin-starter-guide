package com.devsoupe.lec02

fun main() {
    practice_1()
    practice_2()
}

private fun practice_1() {
    val str: String? = "ABC"
    println(str?.length)
}

private fun practice_2() {
    val str: String? = null
    println(str?.length ?: 0)
}

private fun practice_3() {
    val person = Person("공부하는 개발자")
//    startWithA(person.name)
}

fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startWithA1ByElvis(str: String?): Boolean {
    return str?.startsWith("A") ?:
        throw IllegalArgumentException("null이 들어왔습니다.")
}


fun startWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startWithA2ByElvis(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startWithA3ByElvis(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}