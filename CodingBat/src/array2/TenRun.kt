package array2

/*
 *For each multiple of 10 in the given array, change all the values following it
 *to be that multiple of 10, until encountering another multiple of 10. So
 *{2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
 *
 *
 *tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
 *tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
 *tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */

fun main() {
    println(tenRun(arrayOf(2, 10, 3, 4, 20, 5)).contentToString())
    println(tenRun(arrayOf(10, 1, 20, 2)).contentToString())
    println(tenRun(arrayOf(10, 1, 9, 20)).contentToString())
}

fun tenRun(nums: Array<Int>): Array<Int> {
    var multipleOf10 = 0
    var visitedMultipleOf10 = false
    for ((index, num) in nums.withIndex()) {
        if (num % 10 == 0){
            visitedMultipleOf10 = true
            multipleOf10 = num
        }

        if (visitedMultipleOf10){
            nums[index] = multipleOf10
        }
    }
    return nums
}