/*
    Package Practice Activity
    Author: Ruel Hamor
    Date Created: 9/3/22
    Filename: PracticeActivity2.kt
    */
fun main(){
    //Math grade input
    println("Enter grade in Math: ")
    var grade1 : Double = readln().toDouble()

    //English grade input
    println("Enter grade in English: ")
    var grade2 : Double = readln().toDouble()

    //Filipino grade input
    println("Enter grade in Filipino: ")
    var grade3 : Double = readln().toDouble()

    //average of 3 subjects
    var gradeAverage : Double = (grade1 + grade2 + grade3)/3
    println(gradeAverage)
}