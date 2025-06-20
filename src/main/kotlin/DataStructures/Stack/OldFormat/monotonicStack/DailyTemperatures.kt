package DataStructures.Stack.OldFormat.monotonicStack

import java.util.*

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val st = Stack<Int>()
    val hm = mutableMapOf<Int, Int>()
    val res = IntArray(temperatures.size) { 0 }

    for (i in temperatures.indices) {
        while (st.isNotEmpty() && temperatures[st.peek()] < temperatures[i]) {
            val smallerIndex = st.pop()
            hm[smallerIndex] = i
        }
        st.push(i)
    }

    for (index in hm.keys) {
        val values = hm[index]!! - index
        res[index] = values
    }
    return res
}