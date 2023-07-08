package com.devsoupe.lec04

fun main() {
    practice_1()
    practice_2()
    practice_3()
    practice_4()
}

private fun practice_1() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }
}

private fun practice_2() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2)
    println(money1 === money3)
    println(money1 == money3)
}

private fun practice_3() {
    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun2() && fun1()) {
        println("본문")
    }
}

private fun fun1(): Boolean {
    println("fun 1")
    return true
}

private fun fun2(): Boolean {
    println("fun 2")
    return false
}

private fun practice_4() {
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1.plus(money2))
    println(money1 + money2)
}
