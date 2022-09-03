
fun main(){
    println("Enter grade in Math: ")
    var grade1 : Double = readln().toDouble()

    println("Enter grade in English: ")
    var grade2 : Double = readln().toDouble()

    println("Enter grade in Filipino: ")
    var grade3 : Double = readln().toDouble()

    var gradeAverage : Double = (grade1 + grade2 + grade3)/3
    println(gradeAverage)
}