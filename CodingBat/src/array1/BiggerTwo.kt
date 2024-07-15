package array1

/*
Start with 2 int arrays, a and b, each length 2.
Consider the sum of the values in each array.
Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

fun main() {
    println(biggerTwo(arrayOf(1, 2), arrayOf(3, 4)).contentToString())
    println(biggerTwo(arrayOf(3, 4), arrayOf(1, 2)).contentToString())
    println(biggerTwo(arrayOf(1, 1), arrayOf(1, 2)).contentToString())
}

fun biggerTwo(a: Array<Int>, b: Array<Int>): Array<Int> =
    if (a[0] + a[1] < b[0] + b[1]) b
    else a
