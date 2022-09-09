/*
Author: Ruel Hamor
Date Created: 9/9/22
Filename: ExerciseNo4.kt
Exercise No.: 4
*/

fun  main(){

    var numbers = arrayOf<Int> (98, 76, 54, 32, 10)
    var ctr : Int = 0

    while(ctr < numbers.size){
        println("Enter new value: ")
        numbers[ctr] = readln().toInt()
        numbers.set(1,numbers[ctr])

        ctr++
    }

    println(numbers.contentToString())

}