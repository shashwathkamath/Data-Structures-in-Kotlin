package DataStructures.TwoPointers

class Solution002 {

    fun flipCharacters(arr: CharArray) {
        var left = 0
        var right = arr.size - 1

        while (left < right) {
            arr[left] = arr[right].also { arr[right] = arr[left] }
            left++
            right--
        }
    }
}