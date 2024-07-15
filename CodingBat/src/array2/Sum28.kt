package array2

/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */

fun main() {
    println(sum28(arrayOf(2, 3, 2, 2, 4, 2)))
    println(sum28(arrayOf(2, 3, 2, 2, 4, 2, 2)))
    println(sum28(arrayOf(1, 2, 3, 4)))
}

fun sum28(nums: Array<Int>): Boolean {
    var sum = 0
    for (num in nums) {
        if (num == 2) sum += num
    }

    return sum == 8
}