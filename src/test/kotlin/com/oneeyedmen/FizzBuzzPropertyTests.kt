package com.oneeyedmen

import net.jqwik.api.*
import kotlin.test.*

class FizzBuzzPropertyTests {

    @Property
    fun `fizzBuzz returns Fizz for multiples of 3`(
        @ForAll("multiplesOfThreeButNotFive") n: Int
    ) {
        assertEquals("Fizz", n.toFizzBuzz())
    }

    @Property
    fun `fizzBuzz returns Buzz for multiples of 5`(
        @ForAll("multiplesOfFiveButNotThree") n: Int
    ) {
        assertEquals("Buzz", n.toFizzBuzz())
    }


    @Property
    fun `fizzBuzz returns FizzBuzz for multiples of 15`(
        @ForAll("multiplesOfFifteen") n: Int
    ) {
        assertEquals("FizzBuzz", n.toFizzBuzz())
    }


    @Property
    fun `fizzBuzz returns number as string for non-multiples of 3 and 5`(
        @ForAll("nonMultiplesOfThreeAndFive") n: Int
    ) {
        assertEquals(n.toString(), n.toFizzBuzz())
    }

    @Provide
    fun multiplesOfThreeButNotFive(): Arbitrary<Int> =
        Arbitraries.integers().filter { it % 3 == 0 && it % 15 != 0 }

    @Provide
    fun multiplesOfFiveButNotThree(): Arbitrary<Int> =
        Arbitraries.integers().filter { it % 5 == 0 && it % 15 != 0 }

    @Provide
    fun multiplesOfFifteen(): Arbitrary<Int> =
        Arbitraries.integers().filter { it % 15 == 0 }

    @Provide
    fun nonMultiplesOfThreeAndFive(): Arbitrary<Int> =
        Arbitraries.integers().filter { it % 3 != 0 && it % 5 != 0 }
}