fun main() {
    val list = LinkedList<Int>()

    list.append(10)
    list.append(20)
    list.append(30)
    list.append(40)
    list.append(50)

    val head = list.getHead()
    removeNthFromEnd(head, 1)
    list.printList()
    // val newHead = ReverseLinkedList(head)
    // middleNode(head)
    // println("New head $middleNode")
}
