package array1

/*
 *Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 *
 *reverse3([1, 2, 3]) → [3, 2, 1]
 *reverse3([5, 11, 9]) → [9, 11, 5]
 *reverse3([7, 0, 0]) → [0, 0, 7]
 */

fun main() {
    val nums1 = arrayOf(1, 2, 3)
    val nums2 = arrayOf(5, 11, 9)
    val nums3 = arrayOf(7, 0, 0)
    reverse3(nums1)
    reverse3(nums2)
    reverse3(nums3)
    println(nums1.contentToString())
    println(nums2.contentToString())
    println(nums3.contentToString())
}

fun reverse3(nums: Array<Int>) {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp

        start++
        end--
    }
}