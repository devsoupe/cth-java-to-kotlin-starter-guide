package com.devsoupe.lec03

fun main() {
    practice_1()
    practice_2()
    practice_3()
    practice_4()
    practice_5()
    practice_6()
    printAgeIfPersonObjNull(null)
}

private fun practice_1() {
    val number1 = 3
    val number2: Long = number1.toLong()
}

private fun practice_2() {
    val number1: Int? = 3
    //val number2: Long = number1.toLong()
    val number2: Long = number1?.toLong() ?: 0L
}

private fun practice_3() {
    val person = Person("코틀린", 100)
    println("이름 : ${person.name}")
}

private fun practice_4() {
    val name = "코틀린"
    println("이름 : $name")
}

private fun practice_5() {
    val name = "코틀린"
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()

    println(str)
}

private fun practice_6() {
    val str = "ABC"
    println(str[0])
    println(str[2])
}
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPersonNot(obj: Any) {
    if (obj !is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPersonNull(obj: Any) {
    if (obj !is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPersonObjNull(obj: Any?) {
    val person = obj as Person
    println(person.age)
}
