package com.oneeyedmen

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzSequenceTests {

    @Test
    fun `finishes on int overflow`() {
        val values = generateFizzBuzz(Int.MAX_VALUE - 5).toList()
        assertEquals(
            listOf(
                "2147483642", "Fizz", "2147483644", "Buzz", "Fizz", "2147483647"
            ),
            values
        )
    }

    @Test
    fun `can span 0`() {
        val values = generateFizzBuzz(-3).take(7).toList()
        assertEquals(
            listOf(
                "Fizz", "-2", "-1", "FizzBuzz", "1", "2", "Fizz"
            ),
            values
        )
    }
}