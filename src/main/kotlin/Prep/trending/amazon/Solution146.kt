package Prep.trending.amazon

class Solution146 {

}

class LRUCache(capacity: Int) {

    private var head: InnerNode? = InnerNode(0, 0)
    private var tail: InnerNode? = InnerNode(0, 0)
    private val map = mutableMapOf<Int, InnerNode>()
    private val size = capacity

    init {
        head?.next = tail
        tail?.next = head
    }

    fun get(key: Int): Int {
        return if (map.containsKey(key)) {
            val node = map[key]
            moveToFront(node!!)
            node.value
        } else {
            -1
        }
    }

    fun put(key: Int, value: Int) {
        if (!map.containsKey(key)) {
            if (map.size == size) {
                removeLastNode()
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

    private fun removeLastNode() {
        val node = tail?.prev
        removeExistingLink(node!!)
        map.remove(node.key)
    }

    private fun moveToFront(node: InnerNode) {
        removeExistingLink(node)
        addToFront(node)
    }

    private fun removeExistingLink(node: InnerNode) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    private fun addToFront(node: InnerNode) {
        val firstNode = head?.next
        node.next = firstNode
        node.prev = head

        firstNode?.prev = node
        head?.next = node
    }
}

data class InnerNode(
    val key: Int,
    var value: Int,
    var next: InnerNode? = null,
    var prev: InnerNode? = null
)