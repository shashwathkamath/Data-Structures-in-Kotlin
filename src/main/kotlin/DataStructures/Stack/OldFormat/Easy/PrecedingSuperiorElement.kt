package DataStructures.Stack.OldFormat.Easy

import java.util.*

fun precedingSuperiorElement(arr1: IntArray): IntArray {
    //arr1 = [3, 5, 1, 6, 8, 7]

    val st = Stack<Int>()
    val res = IntArray(arr1.size) { -1 }

    for (i in arr1.indices) {
        val currElement = arr1[i]
        while (st.isNotEmpty() && st.peek() <= currElement) {
            st.pop()
        }
        if (st.isNotEmpty()) {
            res[i] = st.peek()
        }
        st.push(currElement)
    }
    return res
}