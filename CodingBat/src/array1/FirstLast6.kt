package array1

/*
 *Given an array of ints, return true if 6 appears as either the first or last element in the array.
 *The array will be length 1 or more.
 *
 *firstLast6([1, 2, 6]) → true
 *firstLast6([6, 1, 2, 3]) → true
 *firstLast6([13, 6, 1, 2, 3]) → false
 */

fun main() {
    println(firstLast6(arrayOf(1, 2, 6)))
    println(firstLast6(arrayOf(6, 1, 2, 3)))
    println(firstLast6(arrayOf(13, 6, 1, 2, 3)))
}

fun firstLast6(nums: Array<Int>): Boolean = (nums[0] == 6 || nums[nums.size-1] == 6)