//class LinkedList<T> {
//    private var head: Node<T>? = null
//
//    // append: Insert at the end
//    fun append(data: T) {
//        val newNode = Node(data)
//        if (head == null) {
//            head = newNode
//            return
//        }
//        var current = head
//        while (current?.next != null) {
//            current = current.next
//        }
//        current?.next = newNode
//    }
//
//    // prepend: Insert at beginning
//    fun prepend(data: T) {
//        val newNode = Node(data)
//        newNode.next = head
//        head = newNode
//    }
//
//    // Delete first occurence of value
//    fun delete(data: T) {
//        if (head == null) return
//        if (head?.data == data) {
//            head = head?.next
//            return
//        }
//
//        var current = head
//        while (current?.next != null) {
//            if (current.next?.data == data) {
//                current.next = current.next?.next
//                return
//            }
//            current = current.next
//        }
//    }
//
//    // Search for value
//    fun search(data: T): Boolean {
//        var current = head
//        while (current?.next != null) {
//            if (current.data == data) {
//                return true
//            }
//            current = current.next
//        }
//        return false
//    }
//
//    // print linkedlist
//    fun printList() {
//        var current = head
//        while (current != null) {
//            println(current.data)
//            current = current.next
//        }
//    }
//
//    fun getHead(): Node<T>? {
//        return head
//    }
//}
