package com.bank

class Bank {    
    var accountsList : MutableList<Account> = mutableListOf()
    
    
    fun createSavingsAccount(){
        accountsList.add(SavingsAccount())
        val lastAccount = accountsList.last()
        val accountsListLenght = accountsList.size
        lastAccount.getAccount(accountsListLenght)
        println(lastAccount.returnBalance())
        println(lastAccount.returnAccountInfo() + "\n")
    }

    // fun removeAccount(accountNumber: Int) {
    //     if (accounts.remove(accountNumber) != null) {
    //         println("Account number $accountNumber has been removed.")
    //     } else {
    //         println("Account number $accountNumber does not exist.")
    //     }
    // }

    fun getAccountDetails(accountNumber: Int): String {
        
        return accountsList[accountNumber].returnAccountInfo()
    }

    fun updateInterest() {
        var i : Int = 0
        for (item in accountsList) {
        accountsList[i].calculateInterest()
        i++ 
        } 
        
        }
}
