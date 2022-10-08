package exercises.com.oopActivity04A

interface PeriodicalsRegistrySystem {



    fun listBook(){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    fun searchBook(title:String){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    fun deleteBook(title: String){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }
}