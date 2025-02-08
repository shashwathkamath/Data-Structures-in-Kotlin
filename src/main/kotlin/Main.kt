fun main() {
    val nums = intArrayOf(2, 3, 4)
    val k = 4

    // first negative Number problem solution
    val res = firstNegativeNumber(nums, k)
    println("size ${res.size}")
    res.forEach { println(it) }
}
