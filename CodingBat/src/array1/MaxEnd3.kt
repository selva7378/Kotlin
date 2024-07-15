package array1

import kotlin.math.max

/*
 *Given an array of ints length 3, figure out which is larger,
 *the first or last element in the array, and set all the other
 *elements to be that value. Return the changed array.
 *
 *maxEnd3([1, 2, 3]) → [3, 3, 3]
 *maxEnd3([11, 5, 9]) → [11, 11, 11]
 *maxEnd3([2, 11, 3]) → [3, 3, 3]
 */

fun main() {
    println(maxEnd3(arrayOf(1, 2, 3)).contentToString())
    println(maxEnd3(arrayOf(11, 5, 9)).contentToString())
    println(maxEnd3(arrayOf(2, 11, 3)).contentToString())
}

fun maxEnd3(nums: Array<Int>): Array<Int> {
    if (nums.size == 0) {
        return nums
    } else {
        val larger = max(nums[0], nums[nums.size-1])
        nums[0] = larger
        nums[1] = larger
        nums[2] = larger
        return nums
    }
}