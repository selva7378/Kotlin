package array1

/*
 *Given an array of ints, swap the first and last elements in the array.
 *Return the modified array. The array length will be at least 1.
 *
 *swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
 *swapEnds([1, 2, 3]) → [3, 2, 1]
 *swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

fun main() {
    println(swapEnds(arrayOf(1, 2, 3, 4)).contentToString())
    println(swapEnds(arrayOf(1, 2, 3)).contentToString())
    println(swapEnds(arrayOf(8, 6, 7, 9, 5)).contentToString())
}

fun swapEnds(nums: Array<Int>): Array<Int> {
    val temp = nums[0]
    nums[0] = nums[nums.size-1]
    nums[nums.size-1] = temp
    return nums
}
