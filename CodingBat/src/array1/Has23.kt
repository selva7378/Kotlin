package array1

/*
 *Given an int array length 2, return true if it contains a 2 or a 3.
 *
 *has23([2, 5]) → true
 *has23([4, 3]) → true
 *has23([4, 5]) → false
 */

fun main() {
    println(has23(arrayOf(2, 5)))
    println(has23(arrayOf(4, 3)))
    println(has23(arrayOf(4, 5)))
}

fun has23(nums: Array<Int>): Boolean = nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3