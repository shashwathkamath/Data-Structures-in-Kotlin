fun nodeExpeditionV2(tail: DLLNode?) {
    var current: DLLNode? = tail

    while (current != null) {
        println("${current.`val`}")
        if (current.prev != null) {
            print(", ")
        }
        current = current.prev
    }
}
