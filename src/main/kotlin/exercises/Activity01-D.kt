/*
Author: Ruel Hamor
Date Created: 9/7/22
Filename: Activity01-D.kt
Exercise No.: 4
*/
fun main(){

    print("---------------------------------------------------------------")
    println("\nThis machine solves total/number from unlimited input amount")
    println("---------------------------------------------------------------")

                                                    //program starts here / declared variables
    var condi : Boolean = true
    var total : Double = 0.00
    var answer : String = " "
    var input : Double = 0.00
    var div : Double = 0.00
    var quotient : Double = 0.00

                                                    //loop statement / condition is true
    while (condi){
        print("Would you like to continue? Y/N: ")  //call to action answerable only by Y / N only
        answer = readln()

        if (answer == "Y" || answer == "y"){        //condition for answer Yes & receives uppercase / lowercase Y
            print("Enter an amount:")               //input amount here
            input = readln().toDouble()
            total = total + input                   //accumulate the amount inputs

        }else if(answer == "N" || answer == "n"){   //condition for answer No & receives uppercase / lowercase N
            println("Total amount is $total")       //display of the accumulated amount

            condi = false                           //condition becomes false / terminate the loop
        }

    }

                                                    //input a number here to divide the total amount
    println("Divide the total by how many? (positive number):")
    div = readln().toDouble()

                                                    //checking: dividend & divisor must be both greater than 1 to execute division
    if (total > 0 && div > 0){                      //condition to meet
        var quotient : Double = total/div           //division operation
        println("\nThe result is $quotient")          //display of the result
        println("Transaction completed")
    }else {
        println("\nInvalid Input")                    //displayed if condition is not met
        println("Please Try Again")
    }

    println("\nTHANK YOU!")

}