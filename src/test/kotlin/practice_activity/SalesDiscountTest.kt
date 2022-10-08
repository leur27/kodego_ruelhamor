package practice_activity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SalesDiscountTest{
    //test cases

    // [1] if 15000 entered, price from Php 10,001 to 20,000 = 5% discount, return Php14,250.00
    @Test
    fun priceAtFifteenThouReturn14250(){
        val salesDiscount = SalesDiscount()
        assertEquals(14250.0, salesDiscount.discountedPrice(15000.0))
    }

    // [2] if 33500 entered, price from Php 20,001 to 50,000 = 10% discount, return Php 29,700.00
    @Test
    fun priceAtThirtyThreeThouReturn29700(){
        val salesDiscount = SalesDiscount()
        assertEquals(29700.0, salesDiscount.discountedPrice(33000.0))
    }

        // [3] if 97000 entered, price from Php 50,001 to 10,000 = 15% discount, return Php 82,450.00
    @Test
    fun priceAtNinetySevenThouReturn82450(){
        val salesDiscount = SalesDiscount()
        assertEquals(82450.0, salesDiscount.discountedPrice(97000.0))
    }

    // [4] if 234000 entered, with price more than Php 100,000 = 20% discount, return Php 187,200.00
    @Test
    fun priceAtTwoThirtyFourThouAndFiveHunReturn187200(){
        val salesDiscount = SalesDiscount()
        assertEquals(187200.0, salesDiscount.discountedPrice(234000.0))
    }

    // [5] if 500 entered, price from Php 1 to 10,000 = no discount, return Php 500.00
    @Test
    fun priceAtFiveHundredReturn500(){
        val salesDiscount = SalesDiscount()
        assertEquals(500.0, salesDiscount.discountedPrice(500.0))
    }

    // [6] if -10 entered, invalid input, return "0"
    @Test
    fun priceAtNegativeTenReturnZero(){
        val salesDiscount = SalesDiscount()
        assertEquals(0.0, salesDiscount.discountedPrice(-10.0))
    }

}