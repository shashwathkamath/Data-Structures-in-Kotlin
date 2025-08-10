package Prep.practice.arrays

class Solution31 {

    fun nextPermutation(nums: IntArray): Unit {
        var n = nums.size

        //find pivot element
        var pivot = -1
        for (i in n - 2 downTo 0) {
            if (nums[i] < nums[i + 1]) {
                pivot = i
                break
            }
        }
        //this means all the elements are already in highest form (all decreasing)
        if (pivot == -1) {
            nums.reverse()
            return
        }
        //if not then seach for element greater than pivot and swap
        for (i in n - 1 downTo pivot + 1) {
            if (nums[i] > nums[pivot]) {
                nums[i] = nums[pivot].also {
                    nums[pivot] = nums[i]
                }
                break
            }
        }
        reverse(nums, pivot + 1, n - 1)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var i = start
        var j = end
        while (i < j) {
            nums[i] = nums[j].also {
                nums[j] = nums[i]
            }
            i++
            j--
        }
    }
}