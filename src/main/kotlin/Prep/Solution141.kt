package Prep

class Solution141 {

    fun hasCycle(head: ListNode?): Boolean {
        if (head == null || head.next == null) return false
        var fast = head
        var slow = head

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next

            if (fast == slow) {
                return true
            }
        }

        return false
    }
}