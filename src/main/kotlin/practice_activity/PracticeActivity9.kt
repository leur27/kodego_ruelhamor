package practice_activity

fun main(){
    //var cellPhone = MobilePhone("Oppo", "D5", 6.5, "purple", 24)
    var cellPhone2 = MobilePhone("Iphone", 5.5)
    var cellPjone3 = MobilePhone("A5", 20)


}
//primary constructor
class MobilePhone(brand:String, model:String, size:Double, color:String, pixel:Int){

    init {
        println("---Mobile Phone Specifications:---")
        println("Brand: $brand")
        println("Model: $model")
        println("Size: $size")
        println("Color: $color")
        println("Pixel: $pixel")
    }
//secondary constructors
    constructor(brand:String, size:Double) : this(brand, "A5", size, "blue", 16 )
    constructor(model:String, pixel:Int) : this("Huawei", model, 5.5, "red", pixel)

    fun powerZoom(){

    }
    fun hdVideo(){

    }
    fun longBatLife(){

    }
    fun dualCamShoot(){

    }

}