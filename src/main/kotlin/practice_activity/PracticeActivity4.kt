fun main(){
    println("Enter product item: ")
    var item : String = readln().toString()

    println("Enter price: ")
    var price : Double = readln().toDouble()

    println("Price of $item is $price")

    if((price >= 10001)&&(price <= 20000)){
        var disc2 : Double = (price * 0.05)
        var price2 : Double = (price - disc2)
        println("Discount is $disc2")
        println("Net Price is $price2")
    }else if((price >= 20001)&&(price <= 50000)) {
        var disc3: Double = (price * 0.10)
        var price3: Double = (price - disc3)
        println("Discount is $disc3")
        println("Net Price is $price3")
    }else if((price >= 50001)&&(price <= 100000)) {
        var disc4: Double = (price * 0.15)
        var price4: Double = (price - disc4)
        println("Discount is $disc4")
        println("Net Price is $price4")
    }else if(price > 100000){
        var disc5 : Double = (price * 0.20)
        var price5 : Double = (price - disc5)
        println("Discount is $disc5")
        println("Net Price is $price5")
    }else {
        println("No Discount")
        println("Net price is $price")
    }
}