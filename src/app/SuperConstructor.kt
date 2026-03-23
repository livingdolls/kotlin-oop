package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Yurina")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer(premiumCustomer.name, 20000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}