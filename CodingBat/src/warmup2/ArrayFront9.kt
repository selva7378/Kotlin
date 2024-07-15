package warmup2

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */

fun main() {
    println(arrayFront9(arrayOf(1, 2, 9, 3, 4)))
    println(arrayFront9(arrayOf(1, 2, 3, 4, 9)))
    println(arrayFront9(arrayOf(1, 2, 3, 4, 5)))
}

fun arrayFront9(nums: Array<Int>): Boolean {
    val loopLength = if (nums.size < 4) nums.size else 4
    for (i in 0 until loopLength) {
        if (nums[i] == 9) return true
    }
    return false
}