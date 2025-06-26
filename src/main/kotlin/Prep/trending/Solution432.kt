package Prep.trending

class Solution432 {

    class AllOne() {
        private val map = mutableMapOf<String, KeyNode>()
        private var head: KeyNode? = KeyNode("", 0)
        private var tail: KeyNode? = KeyNode("", 0)

        init {
            head?.next = tail
            tail?.prev = head
        }

        fun inc(key: String) {
            if (map.containsKey(key)) {
                val node = map[key]!!
                node.count++
                moveNode(node)
            } else {
                val node = KeyNode(key, 1)
                //addToFront(node)
                map[key] = node
            }
        }

        private fun moveNode(node: KeyNode) {
            remove(node)
            var current = head
            while (current?.next != tail && current?.next?.count!! >= node.count) {
                current = current.next
            }
            //addAfter(curr, head)
        }

        private fun addAfter(node: KeyNode) {
            remove(node)
            var current = head

        }

        private fun remove(node: KeyNode) {
            node.prev?.next = node.next
            node.next?.prev = node.prev
        }

        fun dec(key: String) {
            if (map.containsKey(key)) {
                val node = map[key]!!
                var count = node.count
                count--
                if (count == 0) {
                    map.remove(key)
                } else {
                    node.count = count
                    map[key] = node
                }
            }
        }

        fun getMaxKey(): String {
            TODO()
        }

        fun getMinKey(): String {
            TODO()
        }

    }
}

data class KeyNode(
    var key: String,
    var count: Int,
    var next: KeyNode? = null,
    var prev: KeyNode? = null
)