package Prep.epam

class Solution4 {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val m = nums1.size
        val n = nums2.size
        val merged = IntArray(m + n)

        var i = 0
        var j = 0
        var k = 0

        while (i < m && j < n) {
            when {
                nums1[i] < nums2[j] -> merged[k++] = nums1[i++]
                nums2[j] < nums1[i] -> merged[k++] = nums2[j++]
                else -> merged[k++] = nums2[j++]
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++]
        }
        while (j < n) {
            merged[k++] = nums2[j++]
        }

        var median = 0.0
        var totalLen = m + n

        if (totalLen % 2 == 1) {
            median = merged[totalLen / 2].toDouble()
        } else if (totalLen % 2 == 0) {
            val i = totalLen / 2
            median = (merged[i - 1] + merged[i]) / 2.0
        }

        return median
    }
}