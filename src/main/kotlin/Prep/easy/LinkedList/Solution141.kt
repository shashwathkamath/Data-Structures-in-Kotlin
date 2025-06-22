package Prep.easy.LinkedList

import Prep.epam.ListNode

class Solution141 {

    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head?.next

        while (fast != null && fast.next != null) {
            if (slow == fast) return true
            slow = slow?.next
            fast = fast.next?.next
        }

        return false
    }
}