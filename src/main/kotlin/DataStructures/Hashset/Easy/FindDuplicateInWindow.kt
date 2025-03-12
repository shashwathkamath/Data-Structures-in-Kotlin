fun duplicateDetection(arr: IntArray, k: Int): Boolean {
    val set = mutableSetOf<Int>()
    var start = 0

    for (end in arr.indices) {
        val right = arr[end]
        if (set.contains(right)) {
            return true
        }
        set.add(right)
        if (end - start + 1 == k) {
            val left = arr[start]
            set.remove(left)
            start++
        }
    }

    return false
}
