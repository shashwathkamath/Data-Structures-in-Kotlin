package Prep.meta

class Solution146(val capacity: Int) {

    private var head: InnerNode? = InnerNode(0, 9)
    private var tail: InnerNode? = InnerNode(0, 0)
    private val map = mutableMapOf<Int, InnerNode>()
    private val capex = capacity

    init {
        head?.next = tail
        tail?.prev = head
    }

    fun get(key: Int): Int {
        if (map.containsKey(key)) {
            val node = map[key]
            moveToFront(node!!)
            return node.value
        } else {
            return -1
        }
    }

    fun put(key: Int, value: Int) {
        if (!map.containsKey(key)) {
            if (map.size == capex) {
                removeLast()
            }
            val node = InnerNode(key, value)
            map[key] = node
            moveToFront(node)
        } else {
            val node = map[key]
            node!!.value = value
            map[key] = node
            moveToFront(node)
        }
    }

    private fun moveToFront(node: InnerNode) {
        removeExistingLinkIfAny(node)
        addToFront(node)
    }

    private fun removeExistingLinkIfAny(node: InnerNode?) {
        node?.prev?.next = node.next
        node?.next?.prev = node.prev
    }

    private fun addToFront(node: InnerNode) {
        val next = head?.next
        node.next = next
        node.prev = head
        next?.prev = node
        head?.next = node
    }

    private fun removeLast() {
        val lastNode = tail?.prev
        removeExistingLinkIfAny(lastNode)
        map.remove(lastNode?.key)
    }

    class InnerNode(
        var key: Int,
        var value: Int,
        var next: InnerNode? = null,
        var prev: InnerNode? = null
    )
}