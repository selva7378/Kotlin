package array2

/*
 *Given an array of ints, return true if the number of 1's is greater than the number of 4's
 *
 *
 *more14([1, 4, 1]) → true
 *more14([1, 4, 1, 4]) → false
 *more14([1, 1]) → true
 */

fun main() {
    println(more14(arrayOf(1, 4, 1)))
    println(more14(arrayOf(1, 4, 1, 4)))
    println(more14(arrayOf(1, 1)))
}

fun more14(nums: Array<Int>): Boolean {
    var noOf1 = 0
    var noOf4 = 0
    for (num in nums) {
        if (num == 1) noOf1++
        if (num == 4) noOf4++
    }
    return noOf1 > noOf4
}