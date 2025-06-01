class Solution146(private val capacity: Int) {

    private val head: Node? = Node(0, 0)
    private val tail: Node? = Node(0, 0)
    private val map = mutableMapOf<Int, Node>()

    init {
        head?.next = tail
        tail?.prev = head
    }

    fun get(key: Int): Int {
        val node = map[key] ?: return -1
        removeNode(node)
        moveToFront(node)
        return node.data
    }

    private fun moveToFront(node: Node) {
        node.next = head?.next
        node.prev = head
        head?.next?.prev = node
        head?.next = node
    }

    private fun removeNode(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    fun put(key: Int, value: Int) {
        val node = map[key]
        if (node != null) {
            node.data = value
            moveToFront(node)
        } else {
            if (map.size == capacity) {
                removeLast()
            }
            val newNode = Node(value, key)
            map[key] = newNode
            moveToFront(newNode)
        }
    }

    private fun removeLast() {
        val lastNode = tail?.prev
        removeNode(lastNode!!)
        map.remove(lastNode.key)
    }

    data class Node(
        var data: Int,
        var key: Int,
        var next: Node? = null,
        var prev: Node? = null
    )
}