package DataStructures.Stack.OldFormat.Easy

import java.util.*


fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val st = Stack<Int>()
    var poppedIndex = 0

    for (num in pushed) {
        st.push(num)
        while (st.isNotEmpty() != null && st.peek() == popped[poppedIndex]) {
            st.pop()
            poppedIndex++
        }
    }

    return st.isEmpty()
}