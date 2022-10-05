package exercises.com.oopActivity04B

interface InventorySystems {

    fun deleteInventory(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean

}