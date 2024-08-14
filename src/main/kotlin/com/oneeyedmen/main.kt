package com.oneeyedmen

fun main() {
    fizzBuzz(System.out)
}

fun fizzBuzz(out: Appendable) {
    generateFizzBuzz(1).take(100).forEach { out.appendLine(it) }
}

fun generateFizzBuzz(startValue: Int): Sequence<String> =
    sequence {
        var i = startValue
        while (i.isNotAboutToOverflow()) {
            yield(i++.toFizzBuzz())
        }
        yield(i.toFizzBuzz())
    }

private fun Int.isNotAboutToOverflow() = this + 1 > this

fun Int.toFizzBuzz(): String = when {
    this % 15 == 0 -> "FizzBuzz"
    this % 3 == 0 -> "Fizz"
    this % 5 == 0 -> "Buzz"
    else -> toString()
}