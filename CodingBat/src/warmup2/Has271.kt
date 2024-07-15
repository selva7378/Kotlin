package warmup2

import kotlin.math.abs

/*
 Given an array of ints, return true if it contains a 2, 7, 1 pattern:
 a value, followed by the value plus 5, followed by the value minus 1.
 Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

 has271([1, 2, 7, 1]) → true
 has271([1, 2, 8, 1]) → false
 has271([2, 7, 1]) → true
 */


fun main() {
    println(has271(arrayOf(1, 2, 7, 1)))
    println(has271(arrayOf(1, 2, 8, 1)))
    println(has271(arrayOf(2, 7, 1)))
}

fun has271(nums: Array<Int>): Boolean {
    for (i in 0..nums.size-3) {
        if (nums[i + 1] == nums[i] + 5 && abs((nums[i] - 1) - nums[i+2]) <= 2) return true
    }
    return false
}

