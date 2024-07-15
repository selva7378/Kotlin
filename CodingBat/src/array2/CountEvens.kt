package array2

/*
 *Return the number of even ints in the given array.
 *Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 *
 *
 *countEvens([2, 1, 2, 3, 4]) → 3
 *countEvens([2, 2, 0]) → 3
 *countEvens([1, 3, 5]) → 0
 */

fun main() {
    println(countEvens(arrayOf(2, 1, 2, 3, 4)))
    println(countEvens(arrayOf(2, 2, 0)))
    println(countEvens(arrayOf(1, 3, 5)))
}

fun countEvens(nums: Array<Int>): Int {
    var evenCount = 0
    for (num in nums){
        if (num % 2 == 0){
            evenCount++
        }
    }
    return evenCount
}