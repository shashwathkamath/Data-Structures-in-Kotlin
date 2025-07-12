package Prep.bloomberg.Arrays

class Solution556 {

    fun nextGreaterElement(n: Int): Int {
        val arr = n.toString().toCharArray().map { it - '0' }.toIntArray()
        var i = arr.size - 2

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--
        }

        if (i < 0) return -1

        var j = arr.size - 1
        while (j >= 0 && arr[j] <= arr[i]) {
            j--
        }

        arr[i] = arr[j].also { arr[j] = arr[i] }
        var left = i + 1
        var right = arr.size - 1
        while (left < right) {
            arr[left] = arr[right].also { arr[right] = arr[left] }
            left++
            right--
        }

        var result = arr.joinToString("").toLong()
        return if (result > Int.MAX_VALUE || result <= n) -1 else result.toInt()
    }
}