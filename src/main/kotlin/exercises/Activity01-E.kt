/*
Author: Ruel Hamor
Date Created: 9/8/22
Filename: Activity01-E.kt
Exercise No.: 5
*/
fun  main(){

    println("Type a word/words: ")
    var line1 : String = readln()

    println("\nType a word/words: ")
    var line2 : String = readln()

    var combi : String = ""

    for (i in 0 until line1.length) {
        for (j in 0 until line2.length) {
            if (line1[i] == line2[j]) {
                combi += line1[i]
            }
        }
    }

    for (i in 0 until combi.length) {
        var remove = combi[i] + ""
        line1 = line1.replace(remove, "")
        line2 = line2.replace(remove, "")
    }
    println("\nUnique characters are: $line1$line2")

}