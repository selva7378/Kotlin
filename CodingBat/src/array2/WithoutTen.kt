package array2

/*
 *Return a version of the given array where all the 10's have been removed.
 *The remaining elements should shift left towards the start of the array as
 *needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2}
 *yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
 *
 *
 *withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
 *withoutTen([10, 2, 10]) → [2, 0, 0]
 *withoutTen([1, 99, 10]) → [1, 99, 0]
 */

fun main() {
    println(withoutTen(arrayOf(1, 10, 10, 2)).contentToString())
    println(withoutTen(arrayOf(10, 2, 10)).contentToString())
    println(withoutTen(arrayOf(1, 99, 10)).contentToString())
}

fun withoutTen(nums: Array<Int>): Array<Int> {
    var i  = 0
    var j = 0
    while (i < nums.size) {
        if (nums[i] != 10) {
            val temp = nums[i]
            nums[i] = 0
            nums[j] = temp
            j++
        }else nums[i] = 0
        i++
    }
    return nums
}