fun nodeSearch(tail: DLLNode?, data: Int): DLLNode? {
    var current = tail

    while (current != null) {
        if (current.`val` == data) {
            return current
        }
        current = current.prev
    }

    return null
}
