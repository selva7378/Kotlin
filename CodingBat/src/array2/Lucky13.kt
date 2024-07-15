package array2

/*
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

fun main() {
    println(lucky13(arrayOf(0, 2, 4)))
    println(lucky13(arrayOf(1, 2, 3)))
    println(lucky13(arrayOf(1, 2, 4)))
}

fun lucky13(nums: Array<Int>): Boolean {
    for (num in nums) {
        if (num == 1 || num == 3) return false
    }
    return true
}