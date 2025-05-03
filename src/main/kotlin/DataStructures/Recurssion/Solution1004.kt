package DataStructures.Recurssion

class Solution1004 {

    fun recursivelyReverseAQueue(q: ArrayDeque<Int>) {
        if (q.isEmpty()) return
        val n = q.removeFirst()
        recursivelyReverseAQueue(q)
        q.addLast(n)
    }
}