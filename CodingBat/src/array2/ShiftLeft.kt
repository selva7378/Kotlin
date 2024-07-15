package array2

/*
 *Return an array that is "left shifted" by one -- so {6, 2, 5, 3}
 *returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
 *
 *
 *shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
 *shiftLeft([1, 2]) → [2, 1]
 *shiftLeft([1]) → [1]
 */

fun main() {
    println(shiftLeft(arrayOf(6, 2, 5, 3)).contentToString())
    println(shiftLeft(arrayOf(1, 2)).contentToString())
    println(shiftLeft(arrayOf(1)).contentToString())
}

fun shiftLeft(nums: Array<Int>): Array<Int> {
    if (nums.size == 0) return nums
    val temp = nums[0]
    for (i in 1 until nums.size) {
        nums[i-1] = nums[i]
    }
    nums[nums.size-1] = temp
    return nums
}