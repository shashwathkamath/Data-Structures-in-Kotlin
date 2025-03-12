fun subarrayDistinctness(arr: IntArray, k: Int): MutableList<Int> {
    val map = mutableMapOf<Int, Int>()
    var start = 0
    val res = mutableListOf<Int>()

    for (end in arr.indices) {
        val right = arr[end]
        map[right] = map.getOrDefault(right, 0) + 1
        if (end - start + 1 == k) {
            res.add(map.size)
            val left = arr[start]
            if (map.containsKey(left)) {
                map[left] = map[left]!! - 1
                if (map[left] == 0) {
                    map.remove(left)
                }
            }
            start++
        }
    }

    return res
}
