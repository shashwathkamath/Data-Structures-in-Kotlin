package Prep.easy

class Solution350 {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

        nums1.sort()
        nums2.sort()
        var i = 0
        var j = 0
        var res = mutableListOf<Int>()

        while (i < nums1.size && j < nums2.size) {
            when {
                nums1[i] == nums2[i] -> {
                    res.add(nums1[i])
                    i++
                    j++
                }

                nums1[i] > nums2[j] -> j++
                else -> i++
            }

        }

        return res.toIntArray()
    }
}