package array2

/*
 *Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 *
 *
 *either24([1, 2, 2]) → true
 *either24([4, 4, 1]) → true
 *either24([4, 4, 1, 2, 2]) → false
 */

fun main() {
    println(either24(arrayOf(1, 2, 2)))
    println(either24(arrayOf(4, 4, 1)))
    println(either24(arrayOf(4, 4, 1, 2, 2)))
}

fun either24(nums: Array<Int>): Boolean {
    var has2next2 = false
    var has4next4 = false

    for (i in 0 until nums.size-1) {
        if (nums[i] == 2 && nums[i + 1] == 2) has2next2 = true
        if (nums[i] == 4 && nums[i + 1] == 4) has2next2 = true
    }

    return (has2next2 && !has4next4) || (!has2next2 && has4next4)
}