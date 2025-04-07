package DataStructures.Queue.Basic

import DataStructures.Queue.Basic.Util.Queue

class CircularQueue(capacity: Int) : Queue(capacity) {

    override fun enqueue(element: Int): Boolean {
        when {
            isFull() -> {
                return false
            }

            isEmpty() -> {
                frontIndex = 0
                backIndex = 0
            }

            else -> {
                backIndex = (backIndex + 1) % capacity
            }
        }
        arr[backIndex] = element
        size++
        return true
    }

    override fun dequeue(): Int {
        var result = 0
        when {
            isEmpty() -> -1
            else -> {
                result = arr[frontIndex]
                frontIndex = (frontIndex + 1) % capacity
                size--
            }
        }
        if (size == 0) {
            frontIndex = -1
            backIndex = -1
        }
        return result
    }
}