/*
    Package Practice Activity
    Author: Ruel Hamor
    Date Created: 9/3/22
    Filename: PracticeActivity3.kt
    */
fun main(){
    //age input
    println("Enter age: ")
    var age : Int = readln().toInt()

    //category according to age
    if ((age >= 1)&&(age <= 17)) {
        println("Underage")
    }else if((age >= 18)&&(age <= 30)){
        println("Young Adult")
    }else if((age >= 31)&&(age <= 59)){
        println("Adult")
    }else if(age >= 60){
        println("Senior")
    }else {
        println("Invalid age")
    }
}