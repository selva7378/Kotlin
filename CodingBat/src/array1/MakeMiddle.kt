package array1

/*
 *Given an array of ints of even length, return a new array length
 *2 containing the middle two elements from the original array. The original array will be length 2 or more.
 *
 *makeMiddle([1, 2, 3, 4]) → [2, 3]
 *makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 *makeMiddle([1, 2]) → [1, 2]
 */

fun main() {
    println(makeMiddle(arrayOf(1, 2, 3, 4)).toString())
    println(makeMiddle(arrayOf(7, 1, 2, 3, 4, 9)).toString())
    println(makeMiddle(arrayOf(1, 2)).toString())
}

fun makeMiddle(nums: Array<Int>): ArrayList<Int> {
    val midPoint = nums.size / 2
    val arr: ArrayList<Int> = arrayListOf()
    arr.add(nums[midPoint-1])
    arr.add(nums[midPoint])
    return arr
}