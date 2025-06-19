package Prep.epam

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution2 {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyNode: ListNode? = ListNode(0)
        var p = dummyNode
        var c1 = l1
        var c2 = l2
        var carry = 0

        while (c1 != null || c2 != null) {
            var sum = 0
            sum += (c1?.`val` ?: 0) + (c2?.`val` ?: 0) + carry
            p?.next = ListNode(sum % 10)
            carry = sum / 10
            p = p?.next

            c1?.let { c1 = it.next }
            c2?.let { c2 = it.next }
        }

        if (carry != 0) {
            p?.next = ListNode(carry)
        }

        return dummyNode?.next
    }
}