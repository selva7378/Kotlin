package array3

/*
 *Given two arrays of ints sorted in increasing order, outer and inner,
 *return true if all of the numbers in inner appear in outer. The best
 *solution makes only a single "linear" pass of both arrays, taking advantage
 *of the fact that both arrays are already in sorted order.
 *
 *
 *linearIn([1, 2, 4, 6], [2, 4]) → true
 *linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 *linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */

fun main() {
    println(linearIn(arrayOf(1, 2, 4, 6), arrayOf(2, 4)))
    println(linearIn(arrayOf(1, 2, 4, 6), arrayOf(2, 3, 4)))
    println(linearIn(arrayOf(1, 2, 4, 4, 6), arrayOf(2, 4)))
}

fun linearIn(outer: Array<Int>, inner: Array<Int>): Boolean {
    if (inner.isEmpty()) return true
    var j = 0
    for (i in 0..outer.size-1) {
        if (outer[i] == inner[j]){
            j++
        }else if (outer[i] > inner[j]){
            return false
        }

        if (j == inner.size) return true
    }
    return false
}