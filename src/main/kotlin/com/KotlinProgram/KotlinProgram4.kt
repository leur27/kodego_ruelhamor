fun main(){

    var grade : Int = 95


    if ((grade >= 96)&&(grade <=100)) {
        println("1.00")
    }else if((grade >= 86)&&(grade <=95)){
        println("1.75")
    }else if((grade >= 76)&&(grade <=85)){
        println("2.25")
    }else if(grade < 75){
        println("5.0")
    }else {
        println("Invalid grade")
    }

    var gender : String = "F"
    if(gender == "M"){
        println("Male")
    }else if(gender == "F"){
        println("Female")
    }else{
        println("invalid choice")
    }

    //range
//    var idNumber : Int = 1
//    if ((idNumber >=1)&&(idNumber <=3)){
//        println("valid id number")
//    }
//    println("Line ends")
}