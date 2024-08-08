package com.oneeyedmen

import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class FizzBuzzAcceptanceTests {
    @Test
    fun `prints fizzbuzz up to 100`() {
        val stdOutResult = capturingStdOut {
            main()
        }

        val lines = stdOutResult.lines()
        assertEquals(
            firstLines.lines(),
            lines.take(20)
        )
        assertEquals(101, lines.size)
        assertEquals("Buzz", lines.get(99))
        assertEquals("", lines.get(100))
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

private fun capturingStdOut(function: () -> Unit): String {
    val output = ByteArrayOutputStream()
    val oldStdOut = System.out
    System.setOut(PrintStream(output))
    try {
        function.invoke()
        return output.toString("UTF-8")
    } finally {
        System.setOut(oldStdOut)
    }
}
