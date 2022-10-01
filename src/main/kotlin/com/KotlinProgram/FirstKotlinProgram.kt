fun main(){
    /*
    Author: Ruel Hamor
    Date Created: 9/1/22
    Filename: FirstKotlinProgram.kt
    git remote add origin
    */

    var firstName : String = "Ruel"
    var age = 21
    var grade = 75.00
    var section = 'A'
    var isEnrolled = true

    println("Enter your first number: ")
    var firstNumber : Int = readln().toInt()

    println("Enter your second number: ")
    var secondNumber : Int = readln().toInt()

    var sum : Int = firstNumber + secondNumber
    println("The sum is $sum")

    //println("My Name is $firstName")
    //println("I am $age years old")
    //println("I got $grade")
    //println("I belong to section $section")
    //println("Yes it is $isEnrolled I am currently enrolled")
}