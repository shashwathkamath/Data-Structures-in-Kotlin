fun nodeExpeditionV1(head: DLLNode?) {
    var current: DLLNode? = head

    while (current != null) {
        println("${current.`val`}")
        if (current.next != null) {
            print(",")
        }
        current = current.next
    }
}
