package com.oneeyedmen

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class FizzBuzzAcceptanceTests {
    @Test
    @Disabled("Still to be implemented")
    fun `prints fizzbuzz up to 100`() {
        val output = ByteArrayOutputStream()
        fizzBuzz(PrintStream(output))
        val lines = output.toString().lines()
        assertEquals(
            firstLines.lines(),
            lines.take(20)
        )
        assertEquals(101, lines.size)
        assertEquals("Buzz", lines[99])
        assertEquals("", lines[100])
    }
}

private val firstLines = """
    |1
    |2
    |Fizz
    |4
    |Buzz
    |Fizz
    |7
    |8
    |Fizz
    |Buzz
    |11
    |Fizz
    |13
    |14
    |FizzBuzz
    |16
    |17
    |Fizz
    |19
    |Buzz
 """.trimMargin()