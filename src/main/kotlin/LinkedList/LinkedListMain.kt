fun main() {
    val list = LinkedList<Int>()
    list.append(10)
    list.append(20)
    list.append(30)

    list.prepend(5)
    val present = list.search(20)
    println("If data is present $present")

    list.delete(20)
    list.printList()
}
