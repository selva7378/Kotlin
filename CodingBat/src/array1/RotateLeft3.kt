package array1

/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

fun main() {
    println(rotateLeft3(arrayOf(1, 2, 3), 1).contentToString())
    println(rotateLeft3(arrayOf(5, 11, 9), 1).contentToString())
    println(rotateLeft3(arrayOf(7, 0, 0), 1).contentToString())
}

fun rotateLeft3(nums: Array<Int>, position: Int): Array<Int> {
    reverse(nums, 0, position-1)
    reverse(nums, position, nums.size-1)
    reverse(nums, 0, nums.size-1)
    return nums
}

fun reverse(nums: Array<Int>, start: Int, end: Int) {
    var i: Int = start
    var j: Int = end
    while (i < j) {
        val temp: Int = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

        i++
        j--
    }
}