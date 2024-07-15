package array2

/*
 *Given an array of ints, return true if the array contains two 7's next to each other,
 *or there are two 7's separated by one element, such as with {7, 1, 7}.
 *
 *
 *has77([1, 7, 7]) → true
 *has77([1, 7, 1, 7]) → true
 *has77([1, 7, 1, 1, 7]) → false
 */

fun main() {
    println(has77(arrayOf(1, 7, 7)))
    println(has77(arrayOf(1, 7, 1, 7)))
    println(has77(arrayOf(1, 7, 1, 1, 7)))
}

fun has77(nums: Array<Int>): Boolean {
    for ((i, num) in nums.withIndex()) {
        if (i + 1 < nums.size && nums[i] == 7 && nums[i + 1] == 7) {
            return true
        }
        if (i + 2 < nums.size && nums[i] == 7 && nums[i + 2] == 7) {
            return true
        }
    }
    return false
}