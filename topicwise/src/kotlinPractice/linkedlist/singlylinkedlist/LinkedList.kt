package kotlinPractice.linkedlist.singlylinkedlist


data class Node<T>(var data: T, var next: Node<T>? = null)

class LinkedList<T>() {
    var head: Node<T>? = null

    constructor(data: T): this() {
        head = Node<T>(data)
    }

    fun insert(data: T) {
        if (head == null) {
            head = Node<T>(data)
        }else {
            var temp: Node<T>? = head
            while (temp?.next != null) {
                temp = temp?.next
            }
            temp?.next = Node<T>(data)
        }
    }

    fun printList() {
        if (head == null) {
            println("List is empty")
            return
        }
        var temp: Node<T>? = head
        while (temp != null) {
            print("${temp?.data} ")
            temp = temp?.next
        }
        println()
    }
}