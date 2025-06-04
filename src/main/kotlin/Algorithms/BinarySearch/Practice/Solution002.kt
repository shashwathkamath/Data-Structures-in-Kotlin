package Algorithms.BinarySearch.Practice

import kotlin.math.abs

class Solution002 {

    fun findClosestElement(arr: IntArray, target: Int): Int {
        var low = 0
        var high = arr.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            when {
                arr[mid] == target -> return arr[mid]
                arr[mid] < target -> low = mid + 1
                else -> high = mid - 1
            }
        }

        val candidates = mutableListOf<Int>()
        if (low < arr.size) candidates.add(arr[low])
        if (low - 1 >= 0) candidates.add(arr[low - 1])
        return candidates.minWith(
            compareBy(
                { abs(it - target) },
                { it }
            )
        )
    }
}