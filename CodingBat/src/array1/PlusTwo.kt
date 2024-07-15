package array1

/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */

fun main() {
    println(plusTwo(arrayOf(1, 2), arrayOf(3, 4)).contentToString())
    println(plusTwo(arrayOf(4, 4), arrayOf(2, 2)).contentToString())
    println(plusTwo(arrayOf(9, 2), arrayOf(3, 4)).contentToString())
}

fun plusTwo(a: Array<Int>, b: Array<Int>): Array<Int> {
    val arr = Array<Int>(4) {0}
    arr[0] = a[0]
    arr[1] = a[1]
    arr[2] = b[0]
    arr[3] = b[1]
    return arr
}