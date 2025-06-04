package Algorithms.BinarySearch.Practice

interface MountainArray {
    fun get(index: Int): Int
    fun length(): Int
}

class Solution1095 {
    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        val peak = findPeak(mountainArr)

        val asc = searchAsc(0, peak, target, mountainArr)

        return if (asc == -1) {
            searchDsc(peak, mountainArr.length() - 1, target, mountainArr)
        } else {
            asc
        }
    }

    fun searchDsc(low: Int, high: Int, target: Int, mountainArr: MountainArray): Int {
        var l = low
        var r = high
        while (l <= r) {
            val mid = l + (r - l) / 2
            val element = mountainArr.get(mid)
            when {
                element == target -> return mid
                element < target -> r = mid - 1
                else -> l = mid + 1
            }
        }

        return -1
    }

    fun searchAsc(low: Int, high: Int, target: Int, mountainArr: MountainArray): Int {
        var l = low
        var r = high
        while (l <= r) {
            val mid = l + (r - l) / 2
            val element = mountainArr.get(mid)
            when {
                element == target -> return mid
                element > target -> r = mid - 1
                else -> l = mid + 1
            }
        }

        return -1
    }

    fun findPeak(mountainArr: MountainArray): Int {
        var low = 0
        var high = mountainArr.length() - 1

        while (low < high) {
            val mid = low + (high - low) / 2

            when {
                mountainArr.get(mid) <= mountainArr.get(mid + 1) -> low = mid + 1
                else -> high = mid
            }
        }

        return low
    }
}