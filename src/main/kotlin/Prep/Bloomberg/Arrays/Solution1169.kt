package Prep.Bloomberg.Arrays

import kotlin.math.abs

class Solution1169 {

    fun invalidTransactions(transactions: Array<String>): List<String> {
        val map = mutableMapOf<String, MutableList<Triple<Int, Int, Pair<String, String>>>>()

        for (transaction in transactions) {
            val parts = transaction.split(",")
            val name = parts[0]
            val time = parts[1].toInt()
            val amount = parts[2].toInt()
            val city = parts[3]

            if (!map.containsKey(name)) {
                map[name] = mutableListOf<Triple<Int, Int, Pair<String, String>>>()
            }
            map[name]!!.add(Triple(time, amount, Pair(city, transaction)))
        }

        val invalid = mutableSetOf<String>()

        map.forEach { (_, transactionList) ->

            for (i in transactionList.indices) {
                val current = transactionList[i]
                val currentTime = current.first
                val currentAmount = current.second
                val city = current.third.first
                val originalTransactionData = current.third.second

                if (currentAmount > 1000) {
                    invalid.add(originalTransactionData)
                }

                for (j in 1 until transactionList.size) {
                    val newCurrent = transactionList[j]
                    val newCurrentTime = newCurrent.first
                    val newCity = newCurrent.third.first
                    val newOriginalTransactionData = newCurrent.third.second

                    if (abs(currentTime - newCurrentTime) <= 60 && city != newCity) {
                        invalid.add(originalTransactionData)
                        invalid.add(newOriginalTransactionData)
                    }
                }
            }
        }
        return invalid.toList()
    }
}