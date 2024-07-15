package array2

/*
 *Return the sum of the numbers in the array, except ignore sections of numbers
 *starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
 *Return 0 for no numbers.
 *
 *
 *sum67([1, 2, 2]) → 5
 *sum67([1, 2, 2, 6, 99, 99, 7]) → 5
 *sum67([1, 1, 6, 7, 2]) → 4
 */

fun main() {
    println(sum67(arrayOf()))
    println(sum67(arrayOf()))
    println(sum67(arrayOf()))
}

fun sum67(nums: Array<Int>): Int {
    var ignore = false
    var sum = 0
    for (num in nums) {
        if (num == 6 && !ignore){
            ignore = true
            continue
        }

        if (!ignore) sum += num

        if (num == 7 && ignore) {
            ignore = false
        }
    }
    return sum
}