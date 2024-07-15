package array2

/*
 *Return an array that contains the exact same numbers as the given array,
 *but rearranged so that all the even numbers come before all the odd numbers.
 *Other than that, the numbers can be in any order. You may modify and return
 *the given array, or make a new array.
 *
 *
 *evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
 *evenOdd([3, 3, 2]) → [2, 3, 3]
 *evenOdd([2, 2, 2]) → [2, 2, 2]
 */

fun main() {
    println(evenOdd(arrayOf(1, 0, 1, 0, 0, 1, 1)).contentToString())
    println(evenOdd(arrayOf(3, 3, 2)).contentToString())
    println(evenOdd(arrayOf(2, 2, 2)).contentToString())
}

fun evenOdd(nums: Array<Int>): Array<Int> {
    var evenCount = 0
    var i = 0
    while (i < nums.size){
        if (nums[i] % 2 == 0) {
            val temp = nums[i]
            nums[i] = nums[evenCount]
            nums[evenCount++] = temp
        }
        i++
    }
    return nums
}