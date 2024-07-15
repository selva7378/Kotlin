package array1

/*
 *Given an array of ints of odd length, look at the first, last,
 *and middle values in the array and return the largest. The array length will be a least 1.
 *
 *maxTriple([1, 2, 3]) → 3
 *maxTriple([1, 5, 3]) → 5
 *maxTriple([5, 2, 3]) → 5
 */

fun main() {
    println(maxTriple(arrayOf(1, 2, 3)))
    println(maxTriple(arrayOf(1, 5, 3)))
    println(maxTriple(arrayOf(5, 2, 3)))
}

fun maxTriple(nums: Array<Int>): Int {
    val midPoint = nums.size / 2
    return maxOf(nums[0], nums[nums.size-1], nums[midPoint])
}