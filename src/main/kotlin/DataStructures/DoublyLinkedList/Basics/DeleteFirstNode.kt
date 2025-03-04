fun deleteFirstNode(head: DLLNode?): DLLNode? {
    if (head == null || head.next == null) return null
    head.next?.prev = null

    return head.next
}
