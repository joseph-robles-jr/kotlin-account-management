#!/bin/bash

kotlinc -classpath src -d main.jar src/com/bank/Main.kt src/com/bank/Account.kt src/com/bank/SavingsAccount.kt src/com/bank/Bank.kt -include-runtime
