package Prep.leetcode150

class Solution88 {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var p = m + n - 1

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[p--] = nums1[i--]
            } else {
                nums1[p--] = nums2[j--]
            }
        }

        while (j >= 0) {
            nums1[p--] = nums2[j--]
        }
    }

}