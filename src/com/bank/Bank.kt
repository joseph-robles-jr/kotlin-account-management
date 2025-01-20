package com.bank

class Bank {
    private val accounts: MutableMap<Int, Account> = mutableMapOf()
    val savings = SavingsAccount()
    fun createSavingsAccount(){
       savings.getAccount()
       println(savings.returnBalance())
       println(savings.returnAccountInfo() + "\n")
    }

    fun removeAccount(accountNumber: Int) {
        if (accounts.remove(accountNumber) != null) {
            println("Account number $accountNumber has been removed.")
        } else {
            println("Account number $accountNumber does not exist.")
        }
    }

    fun getAccountDetails(accountNumber: Int): Account? {
        return accounts[accountNumber]
    }

    fun printAllAccounts() {
        if (accounts.isNotEmpty()) {
            accounts.forEach { (number, account) ->
                // println("Account Number: $number, Account Holder: ${account.accountHolderName}, Balance: ${account.returnBalance()}")
            }
        } else {
            println("No accounts found.")
        }
    }
}
