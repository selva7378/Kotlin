package warmup2

/*
 *Given an array of ints, return the number of times that two 6's are next to each other in the array.
 *Also count instances where the second "6" is actually a 7.
 *
 *array667([6, 6, 2]) → 1
 *array667([6, 6, 2, 6]) → 1
 *array667([6, 7, 2, 6]) → 1
 */

fun main() {
    println(array667(arrayOf(6, 6, 2)))
    println(array667(arrayOf(6, 6, 2, 6)))
    println(array667(arrayOf(6, 7, 2, 6)))
}

fun array667(nums: Array<Int>): Int {
    var count = 0
    for (i in 0 until nums.size-1) {
        if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
            count++
        }
    }
    return count
}