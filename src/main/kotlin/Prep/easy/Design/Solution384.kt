package Prep.easy.Design

import kotlin.random.Random

class Solution384(private val nums: IntArray) {
    private val array = nums.copyOf()

    fun reset(): IntArray {
        return array
    }

    fun shuffle(): IntArray {
        val result = array.copyOf()
        for (i in result.indices.reversed()) {
            val j = Random.nextInt(0, i + 1)
            result[i] = result[j].also {
                result[j] = result[i]
            }
        }
        return result
    }
}