package array2

/*
 *Return the "centered" average of an array of ints, which we'll say is the
 *mean average of the values, except ignoring the largest and smallest values
 *in the array. If there are multiple copies of the smallest value, ignore just
 *one copy, and likewise for the largest value. Use int division to produce the
 *final average. You may assume that the array is length 3 or more.
 *
 *
 *centeredAverage([1, 2, 3, 4, 100]) → 3
 *centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
 *centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */

fun main() {
    println(centeredAverage(arrayOf(1, 2, 3, 4, 100)))
    println(centeredAverage(arrayOf(1, 1, 5, 5, 10, 8, 7)))
    println(centeredAverage(arrayOf(-10, -4, -2, -4, -2, 0)))
}

fun centeredAverage(nums: Array<Int>): Int {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var totalSum = 0

    for (num in nums) {
        totalSum = totalSum + num
        if (num > max) max = num
        if (num < min) min = num
    }

    return (totalSum - max - min) / (nums.size - 2)
}