package DataStructures.Stack.monotonicStack

import java.util.*

data class StackNode(val price: Int, val count: Int)

class StockSpanner {
    private val st = Stack<StackNode>()

    fun next(price: Int): Int {
        var count = 1
        while (st.isNotEmpty() && st.peek().price <= price) {
            count += st.pop().count
        }
        st.push(StackNode(price, count))
        return count
    }
}
