package array1

/*
 *Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
 *
 *start1([1, 2, 3], [1, 3]) → 2
 *start1([7, 2, 3], [1]) → 1
 *start1([1, 2], []) → 1
 */

fun main() {
    println(start1(arrayOf(1, 2, 3), arrayOf(1, 3)))
    println(start1(arrayOf(7, 2, 3), arrayOf(1)))
    println(start1(arrayOf(1, 2), arrayOf()))
}

fun start1(a: Array<Int>, b: Array<Int>): Int {
    var onesCount = 0
    if (a.size > 0 && a[0] == 1) onesCount++
    if (b.size > 0 && b[0] == 1) onesCount++
    return onesCount
}