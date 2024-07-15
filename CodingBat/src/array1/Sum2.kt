package array1

/*
 *Given an array of ints, return the sum of the first 2 elements in the array.
 *If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 *
 *sum2([1, 2, 3]) → 3
 *sum2([1, 1]) → 2
 *sum2([1, 1, 1, 1]) → 2
 */

fun main() {
    println(sum2(arrayOf(1, 2, 3)))
    println(sum2(arrayOf(1, 1)))
    println(sum2(arrayOf(1, 1, 1, 1)))
}

fun sum2(nums: Array<Int>): Int =
    if (nums.size == 0) 0
    else if (nums.size == 1) nums[0]
    else nums[0] + nums[1]