package com.oneeyedmen

import java.io.PrintStream

fun main() {
    fizzBuzz(out = System.out, rounds = Int.MAX_VALUE)
}

fun fizzBuzz(out: PrintStream, rounds: Int) {
    val lines: Sequence<String> = fizzBuzzLines().take(rounds)
    for (line in lines) {
        out.println(line)
    }
}

private fun fizzBuzzLines(): Sequence<String> =
    generateSequence(1) { it + 1 }.map { it.toFizzBuzz() }

private fun Int.toFizzBuzz() = when {
    this % 15 == 0 -> "FizzBuzz"
    this % 3 == 0 -> "Fizz"
    this % 5 == 0 -> "Buzz"
    else -> toString()
}