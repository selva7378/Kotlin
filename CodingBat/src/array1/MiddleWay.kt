package array1

/*
 *Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 *
 *middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 *middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 *middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

fun main() {
    println(middleWay(arrayOf(1, 2, 3), arrayOf(4, 5, 6)).contentToString())
    println(middleWay(arrayOf(7, 7, 7), arrayOf(3, 8, 0)).contentToString())
    println(middleWay(arrayOf(5, 2, 9), arrayOf(1, 4, 5)).contentToString())
}

fun middleWay(nums1: Array<Int>, nums2: Array<Int>): Array<Int> {
    var nums = Array(2){0}
    nums[0] = nums1[1]
    nums[1] = nums2[1]
    return nums
}