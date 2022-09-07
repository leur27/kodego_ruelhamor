fun main(){
    var names = ArrayList<String>()
    names.add("John")
    names.add("Peter")

    //add elements
    println(names[0])
    println(names[1])

    //remove elements
    names.removeAt(0)//Peter -> index 0

    //display[0]
    println(names[0])
}