package array3

import kotlin.math.max

/*
 *Consider the leftmost and righmost appearances of some value in an array.
 *We'll say that the "span" is the number of elements between the two inclusive.
 *A single value has a span of 1. Returns the largest span found in the given array.
 *(Efficiency is not a priority.)
 *
 *
 *maxSpan([1, 2, 1, 1, 3]) → 4
 *maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
 *maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */

fun main() {
    println(maxSpan(arrayOf(1, 2, 1, 1, 3)))
    println(maxSpan(arrayOf(1, 4, 2, 1, 4, 1, 4)))
    println(maxSpan(arrayOf(1, 4, 2, 1, 4, 4, 4)))
}

fun maxSpan(nums: Array<Int>): Int {
    var maxSpan = 0
    for (i in 0..nums.size - 1) {
        for (j in nums.size-1 downTo  0){
            if (nums[i] == nums[j]) {
                maxSpan = max(j - i + 1, maxSpan)
            }
        }
    }
    return maxSpan
}