import LinkedList.Utils.ListNode

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null || head.next == null || k == 0) return head
    var n = length(head)
    val expectedBreak = k % n
    if (expectedBreak == 0) return head
    var preEnd = n - expectedBreak

    var current = head

    for (i in 1 until preEnd) {
        current = current?.next
    }

    val newHead = current?.next
    current?.next = null

    val lastNode = findLastNode(newHead)
    lastNode?.next = head

    return newHead
}

fun length(head: ListNode?): Int {
    if (head == null) return 0
    var current = head
    var count = 0

    while (current != null) {
        count++
        current = current.next
    }
    return count
}

fun findLastNode(head: ListNode?): ListNode? {
    var current = head
    while (current?.next != null) {
        current = current.next
    }
    return current
}
