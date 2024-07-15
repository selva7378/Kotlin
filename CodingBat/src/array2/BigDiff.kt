package array2

/*
 *Given an array length 1 or more of ints, return the difference between
 *the largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
 *and Math.max(v1, v2) methods return the smaller or larger of two values.
 *
 *
 *bigDiff([10, 3, 5, 6]) → 7
 *bigDiff([7, 2, 10, 9]) → 8
 *bigDiff([2, 10, 7, 2]) → 8
 */

fun main() {
    println(bigDiff(arrayOf(10, 3, 5, 6)))
    println(bigDiff(arrayOf(7, 2, 10, 9)))
    println(bigDiff(arrayOf(2, 10, 7, 2)))
}

fun bigDiff(nums: Array<Int>): Int {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    for (num in nums) {
        if (num > max) max = num
        if (num < min) min = num
    }
    return max - min
}