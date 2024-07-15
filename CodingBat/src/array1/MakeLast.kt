package array1

/*
 *Given an int array, return a new array with double the length where its last element
 *is the same as the original array, and all the other elements are 0. The original
 *array will be length 1 or more. Note: by default, a new int array contains all 0's.
 *
 *makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
 *makeLast([1, 2]) → [0, 0, 0, 2]
 *makeLast([3]) → [0, 3]
 */

fun main() {
    println(makeLast(arrayOf(4, 5, 6)).contentToString())
    println(makeLast(arrayOf(1, 2)).contentToString())
    println(makeLast(arrayOf(3)).contentToString())
}

fun makeLast(nums: Array<Int>): Array<Int> {
    if (nums.size == 0) return nums
    else {
        val newArraySize = nums.size * 2
        val arr = Array<Int>(newArraySize) { 0 }
        arr[newArraySize - 1] = nums[nums.size - 1]
        return arr
    }
}