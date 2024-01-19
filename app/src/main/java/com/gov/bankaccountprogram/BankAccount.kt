package com.gov.bankaccountprogram

class BankAccount(
    val accountHolder: String,
    var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited amount of $$amount")

    }

    fun withdrawal(amount: Double){
        if (amount <= balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew amount of $$amount")
        }else{
            println("You don't have enough funds")
        }

    }

    fun accBalance(): Double{
        return balance

    }

    fun displayTransactionHistory(){
        println("Transaction History of $accountHolder: ")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}