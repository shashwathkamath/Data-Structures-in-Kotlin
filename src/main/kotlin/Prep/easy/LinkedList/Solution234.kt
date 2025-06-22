package Prep.easy.LinkedList

import Prep.epam.ListNode

class Solution234 {

    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return true
        val mid = findMid(head)
        val secondHead = reverse(mid)

        var first = head
        var second = secondHead

        while (second != null) {
            if (first?.`val` != second.`val`) {
                return false
            }
            first = first.next
            second = second.next
        }

        return true
    }

    private fun findMid(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
    }


    private fun reverse(head: ListNode?): ListNode? {
        var current = head
        var prev: ListNode? = null
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }

}