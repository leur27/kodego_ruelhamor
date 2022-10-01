fun main(){
    var string1 : String = "This is my String"
    var string2 : String = "This is my String 2"
    //string character
    println(string1[5])
    //string length
    println(string1.length)
    println(string2.length)
    //string equality
    println(string1 == string2)
    //string uppercase/lowercase
    println(string1.lowercase())
    println(string1.uppercase())
    //startswith/endswith
    println(string2.startsWith(prefix = "this"))
    //concatinate
    println(string1+" "+string2)
    //substring
    println(string1.substring(0,4))
    //replace
    println(string1.replace(oldValue = "This", newValue = "That"))
}
