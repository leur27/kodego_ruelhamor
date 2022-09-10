fun main(){
    var myList = listOf(2,5,3,1) //read only

    //get 2nd element/all elements
    println(myList[3])
    println(myList)
    //display size
    println(myList.size)

    //traverse list
    for(listValue in myList){
        println(listValue)
    }

    //mutable
    var myList2 = mutableListOf<Int>()
    myList2.add(7)
    myList2.add(8)
    myList2.add(9)

    myList2[0] = 10

    for(mylist2Value in myList2){
        println(mylist2Value)
    }

}