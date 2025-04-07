package DataStructures.Queue.Basic.Util

open class Queue(val capacity: Int) {
    protected var size: Int = 0
    protected var frontIndex: Int = -1
    protected var backIndex: Int = -1
    protected var arr: IntArray = IntArray(capacity)

    open fun enqueue(element: Int): Boolean = false
    open fun dequeue(): Int = -1

    fun isEmpty(): Boolean = size == 0
    fun isFull(): Boolean = size == capacity

    fun front(): Int = when {
        isEmpty() -> -1
        else -> arr[frontIndex]
    }

    fun back(): Int = when {
        isEmpty() -> -1
        else -> arr[backIndex]
    }
}