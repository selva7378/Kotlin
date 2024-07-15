package array1

/*
 *Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 *
 *double23([2, 2]) → true
 *double23([3, 3]) → true
 *double23([2, 3]) → false
 */

fun main() {
    println(double23(arrayOf(2, 2)))
    println(double23(arrayOf(3, 3)))
    println(double23(arrayOf(2, 3)))
}

fun double23(nums: Array<Int>): Boolean =
    if (nums.size < 2) false
    else if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) true
    else false
