package com.oneeyedmen

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTests {

    @Test
    fun `is empty if we have no rounds`() {
        assertEquals(emptyList(), fizzBuzz(0))
    }

    @Test
    fun `is just numbers up to 2`() {
        assertEquals(
            listOf("1", "2"),
            fizzBuzz(2)
        )
    }

    @Test
    fun `3 is Fizz`() {
        assertEquals(
            listOf("1", "2", "Fizz"),
            fizzBuzz(3)
        )
    }

    @Test
    fun `5 is Buzz`() {
        assertEquals(
            listOf("1", "2", "Fizz", "4", "Buzz"),
            fizzBuzz(5)
        )
    }

    @Test
    fun `divisible by 3 is Fizz`() {
        assertEquals("Fizz", 3.toFizzBuzz())
        assertEquals("Fizz", 6.toFizzBuzz())
        assertEquals("Fizz", 9.toFizzBuzz())
    }

    @Test
    fun `divisible by 5 is Buzz`() {
        assertEquals("Buzz", 5.toFizzBuzz())
        assertEquals("Buzz", 10.toFizzBuzz())
    }

    @Test
    fun `divisible by 15 is FizzBuzz`() {
        assertEquals("FizzBuzz", 15.toFizzBuzz())
        assertEquals("FizzBuzz", 30.toFizzBuzz())
    }
}

private fun Int.toFizzBuzz(): String =
    this.toLong().toFizzBuzz()

