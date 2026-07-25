fun main() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    var accountType = ""
    var userChoice = 0

    while (accountType == "") {
        println("Choose an option (1, 2 or 3)")

        userChoice = readln().trim().toInt()
        println("The selected option is... $userChoice")

        when (userChoice) {
            1 -> accountType = "Debit"
            2 -> accountType = "Credit"
            3 -> accountType = "Saving"
            else -> continue
        }
    }

    println("You have created a $accountType account.")
    var accountBal = 0

    fun withdraw(amount: Int): Int {
        accountBal -= amount
        println("You withdrawn $amount, remaining balance is $accountBal.")
        return amount
    }

    fun deposit(amount: Int) {
        accountBal += amount
        print("You add $amount to your account, updated balance is $accountBal.")
    }

    fun showBal(){
        println("Your balance is $accountBal.")
    }

    var running = true
    while (running) {
        println("\nWhat would you like to do?")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Check balance")
        println("4. Exit")

        val menuChoice = readln().trim().toInt()

        when (menuChoice) {
            1 -> {
                println("Enter amount to deposit:")
                val amount = readln().trim().toInt()
                deposit(amount)
            }
            2 -> {
                println("Enter amount to withdraw:")
                val amount = readln().trim().toInt()
                withdraw(amount)
            }
            3 -> showBal()
            4 -> {
                println("Thank you for banking with us!")
                running = false
            }
            else -> println("Invalid option, try again.")
        }
    }


}

