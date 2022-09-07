fun main(){

    var names = arrayOf<String> ("John", "Paul", "Mark", "Ringo", "George")
    var ctr : Int = 0

    while(ctr < names.size){
        println("Enter new value $ctr")
        names[ctr] = readln()

        ctr++
    }
    var ctr2 : Int = 0
    while(ctr2 < names.size){
        println("Enter new value $ctr2")
        names[ctr2] = readln()

        ctr2++
    }
}