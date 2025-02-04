package com.bank

class Bank {    
    var accountsList : MutableList<Account> = mutableListOf()
    
    private fun createAccount(){
        val lastAccount = accountsList.last()
        val accountsListLenght = accountsList.size
        lastAccount.getAccount(accountsListLenght)
        clearScreen()
        println(lastAccount.returnBalance())
        println(lastAccount.returnAccountInfo() + "\n")
    }
    
    fun createSavingsAccount(){
        accountsList.add(SavingsAccount())
        // val lastAccount = accountsList.last()
        // val accountsListLenght = accountsList.size
        // lastAccount.getAccount(accountsListLenght)
        // println(lastAccount.returnBalance())
        // println(lastAccount.returnAccountInfo() + "\n")
        createAccount()
    }
    

    fun createCheckingAccount(){
        accountsList.add(CheckingAccount())
        // accountsList.add(CheckingAccount())
        // val lastAccount = accountsList.last()
        // val accountsListLenght = accountsList.size
        // lastAccount.getAccount(accountsListLenght)
        // println(lastAccount.returnBalance())
        // println(lastAccount.returnAccountInfo() + "\n")
        createAccount()
    }


    fun removeAccount(accountNumber: Int): String { //AI was used in the creation of this Method.
        // Convert accountNumber to list index by subtracting 1
        val indexToRemove = accountNumber - 1

        // Check if the index is valid
        if (indexToRemove >= 0 && indexToRemove < accountsList.size) {
            accountsList.removeAt(indexToRemove) //removes account
            accountsList.add(indexToRemove, FillerAccount()) // Adds a blank entry in the space to prevent creating multiple accounts with the same last list number. 
            return "Account number $accountNumber has been removed."
        } else {
            return "Account number $accountNumber does not exist."
        }
    }

    fun getAccountDetails(accountNumber: Int): String {
        if (accountNumber >= 0 && accountNumber < accountsList.size) {
            return accountsList[accountNumber].returnAccountInfo()
        } else {
            return "Account Number: $accountNumber does not exist."
        }
    }

    fun updateInterest() {
        println("Updating intrest ... ... ...")
        var i : Int = 0
        for (item in accountsList) {
        accountsList[i].calculateInterest()
        i++ 
        } 
        clearScreen()
        println("Update Complete!")
        }
}
