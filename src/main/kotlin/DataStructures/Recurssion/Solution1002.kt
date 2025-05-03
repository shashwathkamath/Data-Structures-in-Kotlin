package DataStructures.Recurssion

import java.util.*

class Solution1002 {

    //9 5 1 2

    fun recursivelyReverseAStack(s: Stack<Int>) {
        if (s.isEmpty()) {
            return
        }
        val top = s.peek()
        s.pop()
        recursivelyReverseAStack(s)
        insertAtBottom(s, top)
    }

    private fun insertAtBottom(s: Stack<Int>, element: Int) {
        if (s.isEmpty()) {
            s.push(element) //2
        } else {
            val top = s.pop() //2
            insertAtBottom(s, element) //2 1
            s.push(top)
        }
    }
}