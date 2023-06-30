package com.devsoupe.lec01

import java.util.*

fun main() {
  practice_1()
  practice_2()
  practice_3()
//  practice_4()
  practice_5()
  practice_6()
  practice_7()
  practice_8()
  practice_9()
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
  val numbers = Arrays.asList(2, 3)
//  numbers = mutableListOf(2, 3)
  numbers.add(3)
}

fun practice_5() {
  val numbers = listOf(2, 3)
//  numbers = mutableListOf(2, 3)
//  numbers.add(3)
}

fun practice_6() {
  val numbers = mutableListOf(2, 3)
//  numbers = mutableListOf(2, 3)
  numbers.add(3)
}

fun practice_7() {
  var number1: Long = 10L
  var number3: Long = 1_000L
}

fun practice_8() {
  var number1 = 10L
  var number3: Long? = 1_000L
  number3 = null
}

fun practice_9() {
  val person = Person("최태현")
}