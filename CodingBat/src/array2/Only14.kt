package array2

/*
 *Given an array of ints, return true if every element is a 1 or a 4.
 *
 *
 *only14([1, 4, 1, 4]) → true
 *only14([1, 4, 2, 4]) → false
 *only14([1, 1]) → true
 */

fun main(){
    println(only14(arrayOf(1, 4, 1, 4)))
    println(only14(arrayOf(1, 4, 2, 4)))
    println(only14(arrayOf(1, 1)))
}

fun only14(nums: Array<Int>): Boolean {
    for (num in nums) {
        if (num != 1 && num != 4) return false
    }
    return true
}