package DataStructures.Stack.OldFormat.Basics

class Stack(private val capacity: Int) {
    private val arr = IntArray(capacity)
    private var topIndex = -1

    fun push(element: Int): Boolean {
        if (size() == capacity) {
            return false
        }
        val index = size()
        arr[index] = element
        topIndex = index
        return true
    }

    fun pop(): Int {
        if (isEmpty()) return -1
        val element = arr[topIndex]
        topIndex--
        return element
    }

    fun size(): Int {
        return topIndex + 1
    }

    fun isEmpty(): Boolean {
        return size() == 0
    }

    fun top(): Int {
        return if (isEmpty()) -1 else arr[topIndex]
    }

}