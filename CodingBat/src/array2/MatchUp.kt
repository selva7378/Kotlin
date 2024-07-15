package array2

import kotlin.math.abs

/*
 *Given arrays nums1 and nums2 of the same length, for every element in nums1,
 *consider the corresponding element in nums2 (at the same index). Return
 *the count of the number of times that the two elements differ by 2 or less, but are not equal.
 *
 *
 *matchUp([1, 2, 3], [2, 3, 10]) → 2
 *matchUp([1, 2, 3], [2, 3, 5]) → 3
 *matchUp([1, 2, 3], [2, 3, 3]) → 2
 */

fun main() {
    println(matchUp(arrayOf(1, 2, 3), arrayOf(2, 3, 10)))
    println(matchUp(arrayOf(1, 2, 3), arrayOf(2, 3, 5)))
    println(matchUp(arrayOf(1, 2, 3), arrayOf(2, 3, 3)))
}

fun matchUp(nums1: Array<Int>, nums2: Array<Int>): Int {
    var res = 0
    for (i in 0 until nums1.size){
        if (abs(nums1[i] - nums2[i]) <= 2 && nums2[i] != nums1[i]) res++
    }
    return res
}