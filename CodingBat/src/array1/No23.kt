package array1

/*
 *Given an int array length 2, return true if it does not contain a 2 or 3.
 *
 *no23([4, 5]) → true
 *no23([4, 2]) → false
 *no23([3, 5]) → false
 */

fun main() {
    println(no23(arrayListOf(4, 5)))
    println(no23(arrayListOf(4, 2)))
    println(no23(arrayListOf(3, 5)))
}

fun no23(nums: ArrayList<Int>): Boolean = nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3