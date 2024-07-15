package array2

/*
 *Return a version of the given array where each zero value in the array is replaced
 *by the largest odd value to the right of the zero in the array. If there is no odd
 *value to the right of the zero, leave the zero as a zero.
 *
 *
 *zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
 *zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
 *zeroMax([0, 1, 0]) → [1, 1, 0]
 */

fun main() {
    println(zeroMax(arrayOf(0, 5, 0, 3)).contentToString())
    println(zeroMax(arrayOf(0, 4, 0, 3)).contentToString())
    println(zeroMax(arrayOf(0, 1, 0)).contentToString())
}

fun zeroMax(nums: Array<Int>): Array<Int> {
    var i = nums.size - 1
    var max = 0
    while (i >= 0) {
        if (nums[i] % 2 != 0) max = maxOf(nums[i], max)
        else if (nums[i] == 0)nums[i] = max
        i--
    }
    return nums
}