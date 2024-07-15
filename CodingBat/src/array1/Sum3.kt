package array1

/*
 *Given an array of ints length 3, return the sum of all the elements.
 *
 *sum3([1, 2, 3]) → 6
 *sum3([5, 11, 2]) → 18
 *sum3([7, 0, 0]) → 7
 */

fun main() {
    println(sum3(arrayOf(1, 2, 3)))
    println(sum3(arrayOf(5, 11, 2)))
    println(sum3(arrayOf(7, 0, 0)))
}

fun sum3(nums: Array<Int>): Int {
    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum
}