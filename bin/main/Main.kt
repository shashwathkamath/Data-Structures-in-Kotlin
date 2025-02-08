fun main() {
    val nums = intArrayOf(12, -1, -7, 8, -15, 30, 16, 28)
    val k = 4

    // first negative Number problem solution
    val res = firstNegativeNumber(nums, k)
    println("size ${res.size}")
    res.forEach { println(it) }
}
