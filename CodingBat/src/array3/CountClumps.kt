package array3

/*
 *Say that a "clump" in an array is a series of 2 or more adjacent elements
 *of the same value. Return the number of clumps in the given array.
 *
 *
 *countClumps([1, 2, 2, 3, 4, 4]) → 2
 *countClumps([1, 1, 2, 1, 1]) → 2
 *countClumps([1, 1, 1, 1, 1]) → 1
 */

fun main() {
    println(countClumps(arrayOf(1, 2, 2, 3, 4, 4)))
    println(countClumps(arrayOf(1, 1, 2, 1, 1)))
    println(countClumps(arrayOf(1, 1, 1, 1, 1)))
}

fun countClumps(nums: Array<Int>): Int {
    var isClump = false
    var count = 0
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1] && !isClump) {
            count++
            isClump = true
        }
        else if (nums[i] != nums[i + 1]) isClump = false
    }
    return count
}