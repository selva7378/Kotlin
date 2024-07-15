package array2

/*
 *Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
 *
 *
 *tripleUp([1, 4, 5, 6, 2]) → true
 *tripleUp([1, 2, 3]) → true
 *tripleUp([1, 2, 4]) → false
 */

fun main() {
    println(tripleUp(arrayOf(1, 4, 5, 6, 2)))
    println(tripleUp(arrayOf(1, 2, 3)))
    println(tripleUp(arrayOf(1, 2, 4)))
}

fun tripleUp(nums: Array<Int>): Boolean {
    for (i in 0 .. nums.size-3) {
        if (nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2]) return true
    }
    return false
}