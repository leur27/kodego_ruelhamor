package exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import total

class QuotientOfNumbersTest{
    //test cases

    //[1] entered 5, 10 and divide by 3
    @Test
    fun enterFiveAndTenDivideBy3(){
        val quotientOfNumbers = QuotientOfNumbers(15,3)
        assertEquals(5, quotientOfNumbers.setDivisor(div = 3))
    }

    //[2] entered 5, 10, 5 and divide by 4
    @Test
    fun enterFiveAndTenAndFiveDivideBy4(){
        val quotientOfNumbers = QuotientOfNumbers(20,4)
        assertEquals(5, quotientOfNumbers.setDivisor(div = 4))
    }

    //[3] entered 5, 10, 5, 10 and divide by 5
    @Test
    fun enterFiveAndTenAndFiveAndTenDivideBy5(){
        val quotientOfNumbers = QuotientOfNumbers(30,5)
        assertEquals(6, quotientOfNumbers.setDivisor(div = 5))
    }

    //[4] entered 5, 10, 5, 10, 6 and divide by 6
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixDivideBy6(){
        val quotientOfNumbers = QuotientOfNumbers(36,6)
        assertEquals(6, quotientOfNumbers.setDivisor(div = 6))
    }

    //[5] entered 5, 10, 5, 10, 6, 6 and divide by 7
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixDivideBy7(){
        val quotientOfNumbers = QuotientOfNumbers(42,7)
        assertEquals(6, quotientOfNumbers.setDivisor(div = 7))
    }

    //[6] entered 5, 10, 5, 10, 6, 6, 14 and divide by 8
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixAndFourteenDivideBy8(){
        val quotientOfNumbers = QuotientOfNumbers(56,8)
        assertEquals(7, quotientOfNumbers.setDivisor(div = 8))
    }

    //[7] entered 5, 10, 5, 10, 6, 6, 14, 7 and divide by 9
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixAndFourteenAndSevenDivideBy9(){
        val quotientOfNumbers = QuotientOfNumbers(63,9)
        assertEquals(7, quotientOfNumbers.setDivisor(div = 9))
    }

    //[8] entered 5, 10, 5, 10, 6, 6, 14, 7, 17 and divide by 10
    @Test
    fun enterFiveAndTenAndFiveAndTenAndSixAndSixAndFourteenAndSevenAndSeventeenDivideBy10(){
        val quotientOfNumbers = QuotientOfNumbers(80,10)
        assertEquals(8, quotientOfNumbers.setDivisor(div = 10))
    }
}