package array1

/*
 *Given an int array of any length, return a new array of its first 2 elements.
 *If the array is smaller than length 2, use whatever elements are present.
 *
 *frontPiece([1, 2, 3]) → [1, 2]
 *frontPiece([1, 2]) → [1, 2]
 *frontPiece([1]) → [1]
 */

fun main() {
    println(frontPiece(arrayOf(1, 2, 3)).contentToString())
    println(frontPiece(arrayOf(1, 2)).contentToString())
    println(frontPiece(arrayOf(1)).contentToString())
}

fun frontPiece(nums: Array<Int>): Array<Int> =
    if (nums.size < 2) nums
    else arrayOf(nums[0], nums[1])