package com.oneeyedmen

import java.lang.Appendable

fun main() {
    fizzBuzz(System.out)
}

fun fizzBuzz(out: Appendable) {
    TODO("Not yet implemented")
}

fun fizzBuzz(n: Int): String {
    return when {
        n % 15 == 0 -> "FizzBuzz"
        n % 3 == 0 -> "Fizz"
        n % 5 == 0 -> "Buzz"
        else -> n.toString()
    }
}