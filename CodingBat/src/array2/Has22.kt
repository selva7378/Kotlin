package array2

/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */

fun main() {
    println(has22(arrayOf(1, 2, 2)))
    println(has22(arrayOf(1, 2, 1, 2)))
    println(has22(arrayOf(2, 1, 2)))
}

fun has22(nums: Array<Int>): Boolean {
    for (i in 0 until nums.size - 1) {
        if (nums[i] == 2 && nums[i + 1] == 2) return true
    }
    return false
}