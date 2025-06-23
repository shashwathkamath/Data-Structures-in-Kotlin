package Prep.easy.Trees

import Prep.epam.TreeNode

class Solution108 {

    fun sortedArrayToBST(nums: IntArray): TreeNode? {

        fun helper(nums: IntArray, left: Int, right: Int): TreeNode? {
            if (left > right) return null
            val mid = left + (right - left) / 2
            val root = TreeNode(nums[mid])
            root.left = helper(nums, left, mid - 1)
            root.right = helper(nums, mid + 1, right)
            return root
        }
        return helper(nums, 0, nums.size - 1)
    }
}