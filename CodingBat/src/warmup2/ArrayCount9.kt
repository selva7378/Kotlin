package warmup2
/*
 *Given an array of ints, return the number of 9's in the array.
 *
 *arrayCount9([1, 2, 9]) → 1
 *arrayCount9([1, 9, 9]) → 2
 *arrayCount9([1, 9, 9, 3, 9]) → 3
 */

fun main() {
    println(arrayCount9(arrayOf(1, 2, 9)))
    println(arrayCount9(arrayOf(1, 9, 9)))
    println(arrayCount9(arrayOf(1,9,9,3,9)))
}

fun arrayCount9(nums: Array<Int>): Int {
    var countOfNine: Int = 0
    for (num in nums) {
        if (num == 9) countOfNine++
    }
    return countOfNine
}