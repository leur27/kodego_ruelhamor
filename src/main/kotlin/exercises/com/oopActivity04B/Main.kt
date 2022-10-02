package exercises

import exercises.com.oopActivity04B.InventorySystem

fun main(){

    val inventorySystem = InventorySystem()
    var condition: Boolean = true
    var select: Int
    var option: Int
    var choose: Int
    var input: Int
    var itemNumber: Int = 0
    var productName: String = " "
    var category: String = " "
    var inventory: Double = 0.0
    var itemUnit: String = " "
    var itemPrice: Double = 0.0


    while (condition) {
        println("Select an option \n[1] Display \n[2] Search  \n[3] Add  \n[4] Edit  \n[5] Delete  \n[0] Exit  \nEnter here:")
        select = readln().toInt()
        if (select == 1) {
            println("<< Display selected >>")
            println("\nDisplay option \n[1] Food \n[2] Toiletries \n[3] Non Food \n[4] All \n[0] Exit \nEnter here:")
            input = readln().toInt()
            when (input){
                1 -> inventorySystem.displayInventoryFood()
                2 -> inventorySystem.displayInventoryToiletries()
                3 -> inventorySystem.displayInventoryNonFood()
                4 -> inventorySystem.displayInventoryAll()
                else -> continue
            }
            println("...display completed")
            println("----------------------------------")
        } else if (select == 2) {
            println("<< Search selected >>")
            println("Searching...")
            println("\nSearch by \n[1] Item No. \n[2] Product Name \n[0] Exit \nEnter here:")
            option = readln().toInt()
            if (option == 1) {
                println("<< Search selected >>")
                println("Searching by item number...")
                println("Enter item number:")
                itemNumber = readln().toInt()
                inventorySystem.searchByItemNumber(itemNumber)
            } else if (option == 2) {
                println("<< Search selected >>")
                println("Searching by product name...")
                println("Enter product name:")
                productName = readln()
                println("Searching details for product ${(productName).uppercase()}")
                inventorySystem.searchByProductName(productName)
            } else {
                println("Item is not listed")
            }
            println("\n...searching completed")
            println("----------------------------------")
        } else if (select == 3) {
            println("<< Add selected >>")
            println("Adding...")
            println("\nChoose type \n[1] Food \n[2] Toiletries \n[3] Non Food \n[0] Exit \nEnter here:")
            choose = readln().toInt()
            if (choose == 1) {
                println("New item no.: ")
                itemNumber = readln().toInt()
                println("New product name: ")
                productName = readln()
                println("New product category: ")
                category = readln()
                println("New inventory count: ")
                inventory = readln().toDouble()
                println("New item unit: ")
                itemUnit = readln()
                println("New unit price: ")
                itemPrice = readln().toDouble()
                inventorySystem.addInventoryFood(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            } else if (choose == 2) {
                println("New item no.: ")
                itemNumber = readln().toInt()
                println("New product name: ")
                productName = readln()
                println("New product category: ")
                category = readln()
                println("New inventory count: ")
                inventory = readln().toDouble()
                println("New item unit: ")
                itemUnit = readln()
                println("New unit price: ")
                itemPrice = readln().toDouble()
                inventorySystem.addInventoryToiletries(
                    itemNumber,
                    productName,
                    category,
                    inventory,
                    itemUnit,
                    itemPrice
                )
            } else if (choose == 3) {
                println("New item no.: ")
                itemNumber = readln().toInt()
                println("New product name: ")
                productName = readln()
                println("New product category: ")
                category = readln()
                println("New inventory count: ")
                inventory = readln().toDouble()
                println("New item unit: ")
                itemUnit = readln()
                println("New unit price: ")
                itemPrice = readln().toDouble()
                inventorySystem.addInventoryNonFood(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            } else {
                continue
            }
            println("\n...adding completed")
            println("----------------------------------")
        } else if (select == 4) {
            println("<< Edit selected >>")
            println("Editing...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName = readln()
            println("New product category: ")
            category = readln()
            println("New inventory count: ")
            inventory = readln().toDouble()
            println("New item unit: ")
            itemUnit = readln()
            println("New unit price: ")
            itemPrice = readln().toDouble()
            inventorySystem.editInventory(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            println("\n...editing completed")
            println("----------------------------------")
        } else if (select == 5) {
            println("<< Delete selected >>")
            println("Deleting...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            inventorySystem.deleteInventory(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            println("\n...deleting completed")
            println("----------------------------------")
        } else {
            println(">>>  Exiting the system <<<")
            condition = false
        }
    }
}

