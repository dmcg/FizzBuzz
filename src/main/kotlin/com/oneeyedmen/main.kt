package com.oneeyedmen

fun main() {
    fizzBuzz(100).forEach { println(it) }
}

fun fizzBuzz(rounds: Int): List<String> =
    (1..rounds).map { round ->
        round.toFizzBuzz()
    }

internal fun Int.toFizzBuzz(): String = when {
    this % 15 == 0 -> "FizzBuzz"
    this % 3 == 0 -> "Fizz"
    this % 5 == 0 -> "Buzz"
    else -> toString()
}