package com.devsoupe.lec01

import java.util.*

fun main() {
  practice_1()
  practice_2()
  practice_3()
  practice_4()
}

fun practice_1() {
  var number1 = 10L
  number1 = 5L

  val number2 = 10L
//  number2 = 5L
}

fun practice_2() {
  var number1: Long = 10L
  val number2: Long = 10L
}

fun practice_3() {
  var number1: Long
  number1 = 5L
  println(number1)

  val number2: Long
  number2 = 10L
  println(number2)
}

fun practice_4() {
  val numbers = Arrays.asList(1, 2)
//  numbers = mutableListOf(2, 3)
  numbers.add(3)
}

fun practice_5() {
  var number1: Long = 10L
  var number3: Long = 1_000L
}

fun practice_6() {
  var number1 = 10L
  var number3: Long? = 1_000L
  number3 = null
}

fun practice_7() {
  val person = Person("최태현")
}