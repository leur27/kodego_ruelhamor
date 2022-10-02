package exercises.com.oopActivity04B

class InventorySystemsAdd: InventorySystem() {

    override fun addInventoryItems(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        super.addInventoryItems(itemNumber, productName, category, inventory, itemUnit, itemPrice)
        foodItem.put(key = itemNumber, value = productName)
        foodItem2.put(key = itemNumber, value = category)
        foodItem3.put(key = itemNumber, value = inventory)
        foodItem4.put(key = itemNumber, value = itemUnit)
        foodItem5.put(key = itemNumber, value = itemPrice)
        return  true
    }

    fun addInventoryToiletries(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        toiletriesItem.put(key = itemNumber, value = productName)
        toiletriesItem2.put(key = itemNumber, value = category)
        toiletriesItem3.put(key = itemNumber, value = inventory)
        toiletriesItem4.put(key = itemNumber, value = itemUnit)
        toiletriesItem5.put(key = itemNumber, value = itemPrice)
        return  true
    }

    fun addInventoryNonFood(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        nonFoodItem.put(key = itemNumber, value = productName)
        nonFoodItem2.put(key = itemNumber, value = category)
        nonFoodItem3.put(key = itemNumber, value = inventory)
        nonFoodItem4.put(key = itemNumber, value = itemUnit)
        nonFoodItem5.put(key = itemNumber, value = itemPrice)
        return  true
    }
}