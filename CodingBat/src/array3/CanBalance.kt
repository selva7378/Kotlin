package array3

/*
 *Given a non-empty array, return true if there is a place to split the array so that
 *the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 *
 *
 *canBalance([1, 1, 1, 2, 1]) → true
 *canBalance([2, 1, 1, 2, 1]) → false
 *canBalance([10, 10]) → true
 */

fun main() {
    println(canBalance(arrayOf(1, 1, 1, 2, 1)))
    println(canBalance(arrayOf(2, 1, 1, 2, 1)))
    println(canBalance(arrayOf(10, 10)))
}

fun canBalance(nums: Array<Int>): Boolean {
    var leftSum = 0
    var rightSum = 0
    for ((i, num) in nums.withIndex()){
        leftSum += num
        for (j in i+1..nums.size-1) {
            rightSum += nums[j]
        }
        if (leftSum == rightSum) return true
        rightSum = 0
    }
    return false
}