package array2

/*
 *Given a number n, create and return a new int array of length n,
 *containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
 *in which case just return a length 0 array. You do not need a
 *separate if-statement for the length-0 case; the for-loop should
 *naturally execute 0 times in that case, so it just works. The syntax
 *to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
 *
 *
 *fizzArray(4) → [0, 1, 2, 3]
 *fizzArray(1) → [0]
 *fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

fun main() {
    println(fizzArray(4).contentToString())
    println(fizzArray(1).contentToString())
    println(fizzArray(10).contentToString())
}

fun fizzArray(n: Int): Array<Int> {
    val nums = Array(n) {0}
    for (i in 0 until n) {
        nums[i] = i
    }
    return nums
}