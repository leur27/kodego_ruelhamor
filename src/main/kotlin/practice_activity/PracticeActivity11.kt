package practice_activity

fun main(){

    println("*** Discount Checker Machine ***")
    println("\nWhat item do you want to check?")
    //product input
    println("Enter product item: ")
    val item : String = readln()
    //adding try-catch block
    try {
        //price input
        println("Enter price: ")
        val price : Double = readln().toDouble()
        val checkDiscount = SalesDiscount()
        checkDiscount.discountedPrice(price)
        when(price>=1){
            true ->println("\nfor a Product Item:      ${item.uppercase()} \nwith the Original Price: ${price}0")
            else->println("\nEnter a valid amount")
        }
    }catch (e:NumberFormatException){
        println(e)
        println("Input digits only")
    }finally {
        println("\nTry again!")
    }
    println("\n---End of the Program---")
}

class SalesDiscount{
    init {
        println("\nChecking discount...")
    }
    fun discountedPrice(price : Double):Double{
        var netPrice : Double = 0.0
        //price @ 5% discount
        if((price >= 10001)&&(price <= 20000)){
            val disc : Double = (price * 0.05)
            netPrice = (price - disc)
            println("-------------------------")
            println("%Discount:   5%")
            println("Less Amount: ${disc}0")
            println("Net Price:   ${netPrice}0")
            print("Price to pay: \"Net Price\"")
            println("\n-------------------------")
        //price @ 10% discount
        }else if((price >= 20001)&&(price <= 50000)) {
            val disc2: Double = (price * 0.10)
            netPrice = (price - disc2)
            println("-------------------------")
            println("%Discount:   10%")
            println("Less Amount: ${disc2}0")
            println("Net Price:   ${netPrice}0")
            print("Price to pay: \"Net Price\"")
            println("\n-------------------------")
        //price @ 15% discount
        }else if((price >= 50001)&&(price <= 100000)) {
            val disc3: Double = (price * 0.15)
            netPrice = (price - disc3)
            println("-------------------------")
            println("%Discount:   15%")
            println("Less Amount: ${disc3}0")
            println("Net Price:   ${netPrice}0")
            print("Price to pay: \"Net Price\"")
            println("\n-------------------------")
        //price @ 20% discount
        }else if(price > 100000){
            val disc4 : Double = (price * 0.20)
            netPrice = (price - disc4)
            println("-------------------------")
            println("%Discount:   20%")
            println("Less Amount: ${disc4}0")
            println("Net Price:   ${(netPrice)}0")
            print("Price to pay: \"Net Price\"")
            println("\n-------------------------")
        //price @ 0% discount
        }else if((price >= 1)&&(price <= 10000)){
            println("-------------------------")
            netPrice = price
            println("%Discount:   0%")
            println("Less Amount: 0")
            println("Net price is ${netPrice}0")
            print("Price to pay: \"Original Price\"")
            println("\nNo Discount")
            println("-------------------------")
        //for negative amount
        }else{
            println("-----------------------------------")
            println("You have entered an invalid input: \n\"Requires positive value\"")
            println("-----------------------------------")
        }
        println("...result displayed")
        return netPrice
    }
}