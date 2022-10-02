package exercises.com.oopActivity04B

class InventorySystemsDelete: InventorySystem() {

    override fun deleteInventory(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        foodItem.remove(itemNumber, productName)
        foodItem2.remove(itemNumber, category)
        foodItem3.remove(itemNumber, inventory)
        foodItem4.remove(itemNumber, itemUnit)
        foodItem5.remove(itemNumber, itemPrice)
        toiletriesItem.remove(itemNumber, productName)
        toiletriesItem2.remove(itemNumber, category)
        toiletriesItem3.remove(itemNumber, inventory)
        toiletriesItem4.remove(itemNumber, itemUnit)
        toiletriesItem5.remove(itemNumber, itemPrice)
        nonFoodItem.remove(itemNumber, productName)
        nonFoodItem2.remove(itemNumber, category)
        nonFoodItem3.remove(itemNumber, inventory)
        nonFoodItem4.remove(itemNumber, itemUnit)
        nonFoodItem5.remove(itemNumber, itemPrice)
        return  true
    }
}