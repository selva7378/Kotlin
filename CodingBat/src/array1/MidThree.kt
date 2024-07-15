package array1

/*
 *Given an array of ints of odd length, return a new array length 3
 *containing the elements from the middle of the array. The array length will be at least 3.
 *
 *midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 *midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 *midThree([1, 2, 3]) → [1, 2, 3]
 */

fun main() {
    println(midThree(arrayOf(1, 2, 3, 4, 5)).contentToString())
    println(midThree(arrayOf(8, 6, 7, 5, 3, 0, 9)).contentToString())
    println(midThree(arrayOf(1, 2, 3)).contentToString())
}

fun midThree(nums: Array<Int>): Array<Int> {
    val arr = Array<Int>(3){0}
    val midPoint = nums.size / 2
    arr[0] = nums[midPoint - 1]
    arr[1] = nums[midPoint]
    arr[2] = nums[midPoint + 1]
    return arr
}