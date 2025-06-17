package Prep.epam

class Solution92 {

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val dummy: ListNode? = ListNode(0)
        dummy?.next = head
        var curr = head
        var prev = dummy
        var i = 1

        while (curr != null && i < left) {
            prev = curr
            curr = curr.next
            i++
        }

        var prevG: ListNode? = null
        i = 0

        while (curr != null && i < right - left + 1) {
            val next = curr.next
            curr.next = prevG
            prevG = curr
            curr = next
            i++
        }

        prev?.next?.next = curr
        prev?.next = prevG

        return dummy?.next
    }
}