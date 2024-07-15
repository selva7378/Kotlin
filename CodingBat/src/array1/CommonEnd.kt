package array1

/*
 *Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
 *Both arrays will be length 1 or more.
 *
 *commonEnd([1, 2, 3], [7, 3]) → true
 *commonEnd([1, 2, 3], [7, 3, 2]) → false
 *commonEnd([1, 2, 3], [1, 3]) → true
 */

fun main() {
    println(commonEnd(arrayOf(1, 2, 3), arrayOf(7, 3)))
    println(commonEnd(arrayOf(1, 2, 3), arrayOf(7, 3, 2)))
    println(commonEnd(arrayOf(1, 2, 3), arrayOf(1, 3)))
}

fun commonEnd(nums1: Array<Int>, nums2: Array<Int>) = (nums1[0] == nums2[0] || nums1[nums1.size-1] == nums2[nums2.size-1])