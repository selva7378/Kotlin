package array2

/*
 *Given a non-empty array of ints, return a new array containing the elements
 *from the original array that come before the first 4 in the original array.
 *The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 *
 *
 *pre4([1, 2, 4, 1]) → [1, 2]
 *pre4([3, 1, 4]) → [3, 1]
 *pre4([1, 4, 4]) → [1]
 */

fun main() {
    println(pre4(arrayOf(1, 2, 4, 1)).contentToString())
    println(pre4(arrayOf(3, 1, 4)).contentToString())
    println(pre4(arrayOf(1, 4, 4)).contentToString())
}

fun pre4(nums: Array<Int>): Array<Int> {
    var arrLen = 0
    for (num in nums){
        if (num == 4) break
        arrLen++
    }

    val arr = Array(arrLen){0}
    for (i in 0..arr.size-1) {
        arr[i] = nums[i]
    }
    return arr
}