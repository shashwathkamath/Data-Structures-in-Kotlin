fun selfExcludedArrayProduct(nums: IntArray): IntArray {
    val n = nums.size
    val leftProduct = IntArray(n) { 1 }
    val rightProduct = IntArray(n) { 1 }
    val ans = IntArray(n)

    for (i in 1 until n) {
        leftProduct[i] = leftProduct[i - 1] * nums[i - 1]
    }

    for (i in n - 2 downTo (0)) {
        rightProduct[i] = rightProduct[n - 1] * nums[n - 1]
    }

    for (i in 0 until (n)) {
        ans[i] = leftProduct[i] * rightProduct[i]
    }
    return ans
}
