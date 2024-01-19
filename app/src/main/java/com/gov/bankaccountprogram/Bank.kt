package com.gov.bankaccountprogram

fun main(){

    val mayankBankAccount = BankAccount("Mayank Dhaundiyal", 239876000.56)
    val sarahBankAccount = BankAccount("Sarah Dhoom", 0.0)

    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdrawal(10.0)
    sarahBankAccount.deposit(300.0)

    mayankBankAccount.deposit(10000.00)
    mayankBankAccount.withdrawal(200000.00)

    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder} has current " +
            "balance of ${sarahBankAccount.accBalance()}")
    //mayankBankAccount.displayTransactionHistory()
    //println("You have current balance of ${mayankBankAccount.accBalance()}")
    //println("${mayankBankAccount.accountHolder}'s total current balance is " +
           // "${mayankBankAccount.balance}")
}