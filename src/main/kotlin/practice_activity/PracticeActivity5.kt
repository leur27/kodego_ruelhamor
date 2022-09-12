/*
Author: Ruel Hamor
Date Created: 9/9/22
Filename: PracticeActivity5.kt
Exercise No.: 5
*/

fun  main(){

    var numbers = arrayOf<Int> (98, 76, 54, 32, 10)

    var ctr : Int = 0

    while(ctr < numbers.size){
        println("Enter number ${ctr+1}: ")
        numbers[ctr] = readln().toInt()
        numbers.set(1,numbers[ctr])

        ctr++
    }

    println("Previous List [8, 76, 54, 32, 10] \nchanged to New List:")
    println(numbers.contentToString())

}