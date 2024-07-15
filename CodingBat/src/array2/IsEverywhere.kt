package array2

/*
 *We'll say that a value is "everywhere" in an array if for every
 *pair of adjacent elements in the array, at least one of the pair
 *is that value. Return true if the given value is everywhere in the array.
 *
 *
 *isEverywhere([1, 2, 1, 3], 1) → true
 *isEverywhere([1, 2, 1, 3], 2) → false
 *isEverywhere([1, 2, 1, 3, 4], 1) → false
 */

fun main() {
    println(isEverywhere(arrayOf(1, 2, 1, 3), 1))
    println(isEverywhere(arrayOf(1, 2, 1, 3), 2))
    println(isEverywhere(arrayOf(1, 2, 1, 3, 4), 1))
}

fun isEverywhere(nums: Array<Int>, value : Int): Boolean {
    for (i in 0 until nums.size-1) {
        if (nums[i] != value && nums[i + 1] != value) return false
    }
    return true
}