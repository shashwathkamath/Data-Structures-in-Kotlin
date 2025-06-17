package Prep

class Solution146(private val capacity: Int) {

    private val head: TNode? = TNode(0, 0)
    private val tail: TNode? = TNode(0, 0)
    private val map = mutableMapOf<Int, TNode>()

    init {
        head?.next = tail
        tail?.prev = head
    }

    fun get(key: Int): Int {
        val node = map[key]
        if (node == null) return -1
        moveToFront(node)
        return node.data
    }

    private fun moveToFront(node: TNode) {
        removeNode(node)
        addToFront(node)
    }

    private fun removeNode(node: TNode?) {
        node?.prev?.next = node.next
        node?.next?.prev = node.prev
    }

    private fun addToFront(node: TNode) {
        node.next = head?.next
        node.prev = head
        head?.next?.prev = node
        head?.next = node
    }

    fun put(key: Int, value: Int) {
        if (map.contains(key)) {
            val node = map[key]!!
            node.data = value
            moveToFront(node)
        } else {
            if (map.size == capacity) {
                removeLastNode()
            }
            val node = TNode(key, value)
            map[key] = node
            moveToFront(node)
        }
    }

    private fun removeLastNode() {
        val lastNode = tail?.prev
        removeNode(lastNode)
        map.remove(lastNode?.key)
    }

    data class TNode(
        val key: Int,
        var data: Int,
        var next: TNode? = null,
        var prev: TNode? = null
    )

}
