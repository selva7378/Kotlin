package array2

/*
 *Return the sum of the numbers in the array, returning 0 for an empty array.
 *Except the number 13 is very unlucky, so it does not count and numbers that
 *come immediately after a 13 also do not count.
 *
 *
 *sum13([1, 2, 2, 1]) → 6
 *sum13([1, 1]) → 2
 *sum13([1, 2, 2, 1, 13]) → 6
 */

fun main() {
    println(sum13(arrayOf(1, 2, 2, 1)))
    println(sum13(arrayOf(1, 1)))
    println(sum13(arrayOf(1, 2, 2, 1, 13)))
}

fun sum13(nums: Array<Int>): Int {
    var sum = 0
    var i = 0
    while (i < nums.size) {
        if (nums[i] == 13){
            i = i + 2
            continue
        }
        sum += nums[i]
        i++
    }
    return sum
}