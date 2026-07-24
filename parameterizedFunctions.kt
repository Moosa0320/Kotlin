var balance = 0.0

fun addMoney(amount: Double){
    balance += amount
    println("Amount added ! Balance: $balance")
}

fun showBalance(){
    println("Balance: $balance")

}

fun withdraw(amount: Double){
    balance -= amount
}

fun main(){
    addMoney(11000.0)
    addMoney(22000.0)
    showBalance()
    withdraw(5600.0)
    showBalance()

}

