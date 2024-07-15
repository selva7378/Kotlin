package array2

/*
 *Given an array of ints, return true if it contains no 1's or it contains no 4's.
 *
 *
 *no14([1, 2, 3]) → true
 *no14([1, 2, 3, 4]) → false
 *no14([2, 3, 4]) → true
 */

fun main() {
    println(no14(arrayOf(1, 2, 3)))
    println(no14(arrayOf(1, 2, 3, 4)))
    println(no14(arrayOf(2, 3, 4)))
}

fun no14(nums: Array<Int>): Boolean {
    var has1 = false
    var has4 = false
    for (num in nums) {
        if (num == 1) has1 = true
        if (num == 4) has4 = true
    }
    return !has1 || !has4
}