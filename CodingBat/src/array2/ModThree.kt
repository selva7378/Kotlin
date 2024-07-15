package array2

/*
 *Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 *
 *
 *modThree([2, 1, 3, 5]) → true
 *modThree([2, 1, 2, 5]) → false
 *modThree([2, 4, 2, 5]) → true
 */

fun main() {
    println(modThree(arrayOf(2, 1, 3, 5)))
    println(modThree(arrayOf(2, 1, 2, 5)))
    println(modThree(arrayOf(2, 4, 2, 5)))
}

fun modThree(nums: Array<Int>): Boolean {
    for (i in 0 until nums.size-2) {
        if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) return true
        if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) return true
    }
    return false
}