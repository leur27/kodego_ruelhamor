package exercises.com.oopActivity04A

interface BooksRegistrySystem {
//    var title: String
//        get() = " "
//        set(value) =
//    val bookTitle: MutableMap<String, Int>
//        get() = mutableMapOf<String, Int>()

    fun listBook(){
        println("This function is from the interface BookRegistrySystem")
    }

   fun searchBook(title:String){
       println("This function is from the interface BookRegistrySystem")
    }

    fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface BookRegistrySystem")
    }

    fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface BookRegistrySystem")
    }

    fun deleteBook(title: String){
        println("This function is from the interface BookRegistrySystem")
    }
}