package DataStructures.Queue.Basic

import java.util.*
import kotlin.collections.ArrayDeque

fun queueInversion(element: IntArray) {
    val stack = Stack<Int>()
    val queue = ArrayDeque<Int>()

    stack.addAll(element.toList())

    while (stack.isEmpty()) {
        queue.add(stack.pop())
    }
}

fun kInversions(elements: IntArray, k: Int) {
    val st = Stack<Int>()
    val q = ArrayDeque<Int>()
    var i = 0

    while (i < elements.size && i < k) {
        st.push(elements[i])
        i++
    } //[3,2,1]

    while (st.isNotEmpty()) {
        q.addLast(st.pop())
    }

    while (i < elements.size) {
        q.addLast(elements[i])
        i++
    }
}

class MyQueue() {

    private val inputStack = ArrayDeque<Int>()
    private val outputStack = ArrayDeque<Int>()


    fun push(x: Int) {
        inputStack.addFirst(x)
    }

    fun pop(): Int {
        if (outputStack.isEmpty()) {
            while (inputStack.isNotEmpty()) {
                outputStack.addFirst(inputStack.removeFirst())
            }
        }
        return outputStack.removeFirst()
    }

    fun peek(): Int {
        if (outputStack.isEmpty()) {
            while (inputStack.isNotEmpty()) {
                outputStack.addFirst(inputStack.removeFirst())
            }
        }
        return outputStack.first()
    }

    fun empty(): Boolean {
        return inputStack.isEmpty() && outputStack.isEmpty()
    }
}