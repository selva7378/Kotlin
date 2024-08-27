package kotlinPractice.linkedlist.singlylinkedlist

fun main() {
    var list: LinkedList<Int> = LinkedList()
    list.printList()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.printList()

    var list1 = LinkedList(9)
    list1.insert(8)
    list1.insert(7)
    list1.insert(6)
    list1.printList()
}