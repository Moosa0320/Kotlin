var cart = 0.0

val rice = 5000.0
val flour = 1000.0
val sugar = 500.0
val oil = 900.0
val tea = 250.0

fun main() {

    while (true) {

        println("\n====== Grocery Store ======")
        println("1. Add Items to Cart")
        println("2. View My Cart")
        println("3. Checkout")
        println("4. Exit")
        print("Enter your choice: ")

        when (readln().toInt()) {

            1 -> addItems()

            2 -> {
                println("Your Cart Total = Rs. $cart")
            }

            3 -> {
                println("Checkout Successful!")
                println("Total Bill = Rs. $cart")
                println("Thank you for shopping.")
                cart = 0.0
            }

            4 -> {
                println("Good Bye!")
                break
            }

            else -> println("Invalid Choice")
        }
    }
}

fun addItems() {

    while (true) {

        println("\n----- Item List -----")
        println("1. Rice   - Rs.5000")
        println("2. Flour  - Rs.1000")
        println("3. Sugar  - Rs.500")
        println("4. Oil    - Rs.900")
        println("5. Tea    - Rs.250")
        println("6. Back to Main Menu")

        print("Select Item: ")

        when (readln().toInt()) {

            1 -> {
                cart += rice
                println("Rice Added")
            }

            2 -> {
                cart += flour
                println("Flour Added")
            }

            3 -> {
                cart += sugar
                println("Sugar Added")
            }

            4 -> {
                cart += oil
                println("Oil Added")
            }

            5 -> {
                cart += tea
                println("Tea Added")
            }

            6 -> break

            else -> println("Invalid Choice")
        }

        println("Current Cart = Rs. $cart")
    }
}