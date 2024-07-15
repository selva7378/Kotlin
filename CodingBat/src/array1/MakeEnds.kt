package array1

/*
Given an array of ints, return a new array length 2 containing the first
and last elements from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */

fun main() {
    println(makeEnds(arrayOf(1, 2, 3)).contentToString())
    println(makeEnds(arrayOf(1, 2, 3, 4)).contentToString())
    println(makeEnds(arrayOf(7, 4, 6, 2)).contentToString())
}

fun makeEnds(nums: Array<Int>): Array<Int> = arrayOf(nums[0], nums[nums.size - 1])