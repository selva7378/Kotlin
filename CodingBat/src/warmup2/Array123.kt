package warmup2

/*
 *Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 *
 *array123([1, 1, 2, 3, 1]) → true
 *array123([1, 1, 2, 4, 1]) → false
 *array123([1, 1, 2, 1, 2, 3]) → true
 */

fun main() {
    println(array123(arrayOf(1, 1, 2, 3, 1)))
    println(array123(arrayOf(1, 1, 2, 4, 1)))
    println(array123(arrayOf(1, 1, 2, 1, 2, 3)))
}

fun array123(nums: Array<Int>): Boolean {
    if (nums.size < 3) return false
    for (i in 0..nums.size-3) {
        if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true
    }
    return false
}