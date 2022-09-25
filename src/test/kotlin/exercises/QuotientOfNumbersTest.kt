package exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import total

class QuotientOfNumbersTest{
    //test cases

    //
    @Test
    fun enterFiveAndTenDivideBy3(){
        val quotientOfNumbers = QuotientOfNumbers(15,3)
        assertEquals(5, quotientOfNumbers.setDivisor(div = 3))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveDivideBy4(){
        val quotientOfNumbers = QuotientOfNumbers(20,4)
        assertEquals(5, quotientOfNumbers.setDivisor(div = 4))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveAndTenDivideBy5(){
        val quotientOfNumbers = QuotientOfNumbers(30,5)
        assertEquals(6, quotientOfNumbers.setDivisor(div = 5))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixDivideBy6(){
        val quotientOfNumbers = QuotientOfNumbers(36,6)
        assertEquals(6, quotientOfNumbers.setDivisor(div = 6))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixDivideBy7(){
        val quotientOfNumbers = QuotientOfNumbers(42,7)
        assertEquals(6, quotientOfNumbers.setDivisor(div = 7))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixAndFourteenDivideBy8(){
        val quotientOfNumbers = QuotientOfNumbers(56,8)
        assertEquals(7, quotientOfNumbers.setDivisor(div = 8))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixAndFourteenAndSevenDivideBy9(){
        val quotientOfNumbers = QuotientOfNumbers(63,9)
        assertEquals(7, quotientOfNumbers.setDivisor(div = 9))
    }

    //
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixAndFourteenAndSevenAndSeventeenDivideBy10(){
        val quotientOfNumbers = QuotientOfNumbers(80,10)
        assertEquals(8, quotientOfNumbers.setDivisor(div = 10))
    }
}