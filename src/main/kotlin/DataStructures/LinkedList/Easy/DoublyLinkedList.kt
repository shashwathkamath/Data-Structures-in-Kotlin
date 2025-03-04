class DoubleLinkedList<T> {
    private var head: DoubleNode<T>? = null
    private var tail: DoubleNode<T>? = null

    fun append(data: T) {
        val newNode = DoubleNode(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.prev = newNode
            tail = newNode
        }
    }

    fun prepend(data: T) {
        val newNode = DoubleNode(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head?.prev = newNode
            head = newNode
        }
    }

    fun delete(data: T) {
        var current = head
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev?.next = current.next
                } else {
                    head = current.next
                }
                if (current.next != null) {
                    current.prev = current.next?.prev
                } else {
                    tail = current.prev
                }
                return
            }
            current = current.next
        }
    }

    fun search(data: T): Boolean {
        var current = head
        while (current != null) {
            if (current.data == data) return true
            current = current.next
        }
        return false
    }

    fun printForward() {
        var current = head
        while (current != null) {
            println(current.data)
            current = current.next
        }
    }

    fun printBackward() {
        var current = tail
        while (current != null) {
            println(current.data)
            current = current.prev
        }
    }
}
