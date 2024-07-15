package array2

/*
 *Given a non-empty array of ints, return a new array containing the elements
 *from the original array that come after the last 4 in the original array.
 *The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 *
 *
 *post4([2, 4, 1, 2]) → [1, 2]
 *post4([4, 1, 4, 2]) → [2]
 *post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

fun main() {
    println(post4(arrayOf(2, 4, 1, 2)).contentToString())
    println(post4(arrayOf(4, 1, 4, 2)).contentToString())
    println(post4(arrayOf(4, 4, 1, 2, 3)).contentToString())
}

fun post4(nums: Array<Int>): Array<Int> {
    var arrLen = 0
    for (num in nums.reversed()){
        if (num == 4) break
        arrLen++
    }

    val arr = Array(arrLen){0}
    var j = 0
    for (i in nums.size - arrLen until nums.size){
        arr[j++] = nums[i]
    }
    return arr
}