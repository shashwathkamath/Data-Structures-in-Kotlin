import LinkedList.Utils.ListNode

fun isPalindrome(head: ListNode?): Boolean {
    if (head == null || head.next == null) return true

    val mid = findMiddle(head)
    var newHead = reverse(mid?.next)

    var first = head
    var second = newHead

    while (second != null) {
        if (first?.data != second.data) {
            return false
        }
        first = first.next
        second = second.next
    }
    return true
}

fun findMiddle(head: ListNode?): ListNode? {
    var slow = head
    var fast = head

    while (fast?.next != null && fast.next?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}

fun reverse(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev
}
