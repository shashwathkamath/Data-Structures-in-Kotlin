package Prep.practice

class Solution901 {


}

class StockSpanner() {
    var st: ArrayDeque<Pair<Int, Int>> = ArrayDeque<Pair<Int, Int>>()
    var result = mutableListOf<Int>()

    fun next(price: Int): Int {
        var spanValue = 1
        while (st.isNotEmpty() && st.last().first <= price) {
            spanValue += st.removeLast().second
        }
        st.addLast(Pair(price, spanValue))
        return st.last().second
    }
}