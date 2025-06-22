package Prep.easy.LinkedList

import Prep.epam.ListNode

class Solution237 {

    fun deleteNode(node: ListNode?) {
        node?.`val` = node.next?.`val`!!
        node?.next = node.next?.next
    }
}