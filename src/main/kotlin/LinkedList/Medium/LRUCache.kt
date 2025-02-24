class LRUCache(private var capacity: Int) {

    class LRUNode(var key: Int, var value: Int) {
        var prev: LRUNode? = null
        var next: LRUNode? = null
    }
    private val map = mutableMapOf<Int, LRUNode>()
    private val head: LRUNode = LRUNode(0, 0)
    private val tail: LRUNode = LRUNode(0, 0)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        if (!map.containsKey(key)) return -1
        val node = map[key]
        moveToHead(node)
        return node!!.value
    }

    fun put(key: Int, value: Int) {
        if (map.containsKey(key)) {
            val node = map[key]!!
            node.value = value
            moveToHead(node)
        } else {
            if (map.size > capacity) {
                removeLRU()
            }
            val newNode = LRUNode(key, value)
            map[key] = newNode
            insertNodeToHead(newNode)
        }
    }

    fun moveToHead(node: LRUNode?) {
        removeNode(node)
        insertNodeToHead(node)
    }

    fun removeNode(node: LRUNode?) {
        val prevNode = node?.prev
        val nextNode = node?.next
        prevNode?.next = nextNode
        nextNode?.prev = prevNode
    }

    fun insertNodeToHead(node: LRUNode?) {
        node?.next = head.next
        head.next?.prev = node
        head.next = node
        node?.prev = head
    }

    fun removeLRU() {
        val lastNode = tail.prev!!
        removeNode(lastNode)
        map.remove(lastNode.key)
    }
}
