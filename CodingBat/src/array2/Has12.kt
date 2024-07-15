package array2

/*
 *Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
 *
 *
 *has12([1, 3, 2]) → true
 *has12([3, 1, 2]) → true
 *has12([3, 1, 4, 5, 2]) → true
 *has12([3, 1, 4, 5, 6]) → false
 */

fun main() {
    println(has12(arrayOf(1, 3, 2)))
    println(has12(arrayOf(3, 1, 2)))
    println(has12(arrayOf(3, 1, 4, 5, 2)))
    println(has12(arrayOf(3, 1, 4, 5, 6)))
}

fun has12(nums: Array<Int>): Boolean {
    var isOnePresent = false
    for (num in nums){
        if(num == 1) isOnePresent = true
        if (num == 2 && isOnePresent) return true
    }
    return false
}