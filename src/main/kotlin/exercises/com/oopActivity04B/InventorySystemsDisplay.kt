package exercises.com.oopActivity04B

class InventorySystemsSearch: InventorySystem() {

    fun displayInventoryAll():Boolean{
        var combinedMap = foodItem + toiletriesItem + nonFoodItem
        for (key in foodItem.keys) {
            combinedMap += foodItem
        }
        for (key in toiletriesItem.keys) {
            combinedMap += toiletriesItem
        }
        for (key in nonFoodItem.keys) {
            combinedMap += nonFoodItem
        }
        val sortedMap = combinedMap.toSortedMap()
        for (key in sortedMap.keys) {
            println("Item No.: $key   Product Name: ${(sortedMap[key]).toString().uppercase()}")
        }
        println("\nThis directory contains ${(sortedMap.size)} items ")
        return true
    }

}