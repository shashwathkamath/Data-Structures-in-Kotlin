package Prep.practice.stacks

class Solution001 {

    fun leftSmaller(arr: IntArray): IntArray {
        val size = arr.size
        val res = IntArray(size) { -1 }
        val st = ArrayDeque<Int>()

        for (i in 0 until size) {
            while (st.isNotEmpty() && st.last() >= arr[i]) {
                st.removeLast()
            }
            if (st.isNotEmpty()) {
                res[i] = st.last()
            }
            st.addLast(arr[i])
        }

        return res
    }
}