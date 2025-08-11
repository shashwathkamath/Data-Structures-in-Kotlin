package Prep.practice.arrays

class Solution239 {

    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val dq = ArrayDeque<Int>()
        val res = mutableListOf<Int>()
        //for the resume for first window
        for (i in 0 until k) {
            while (dq.isNotEmpty() && nums[dq.last()] <= nums[i]) {
                dq.removeLast()
            }
            dq.addLast(i)
        }

        for (i in k until nums.size) {
            res.add(nums[dq.first()])
            while (dq.isNotEmpty() && nums[dq.first()] <= i - k) {
                dq.removeFirst()
            }

            while (dq.isNotEmpty() && dq.last() <= nums[i]) {
                dq.removeLast()
            }
            dq.addLast(i)
        }
        return res.toIntArray()
    }
}