package array2

/*
 *Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 *
 *
 *haveThree([3, 1, 3, 1, 3]) → true
 *haveThree([3, 1, 3, 3]) → false
 *haveThree([3, 4, 3, 3, 4]) → false
 */

fun main() {
    println(haveThree(arrayOf(3, 1, 3, 1, 3)))
    println(haveThree(arrayOf(3, 1, 3, 3)))
    println(haveThree(arrayOf(3, 4, 3, 3, 4)))
}

fun haveThree(nums: Array<Int>): Boolean {
    var count3 = 0
    for (i in 0 until nums.size) {
        if (nums[i] == 3) count3++
        if (i + 1 < nums.size && nums[i] == 3 && nums[i + 1] == 3) {
            return false
        }
    }
    return count3 == 3
}