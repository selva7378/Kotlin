package warmup2

/*
 *Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
 *Return true if the array does not contain any triples.
 *
 *noTriples([1, 1, 2, 2, 1]) → true
 *noTriples([1, 1, 2, 2, 2, 1]) → false
 *noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

fun main() {
    println(noTriples(arrayOf(1, 1, 2, 2, 1)))
    println(noTriples(arrayOf(1, 1, 2, 2, 2, 1)))
    println(noTriples(arrayOf(1, 1, 1, 2, 2, 2, 1)))
}

fun noTriples(nums: Array<Int>): Boolean {
    for (i  in 0..nums.size-3) {
        if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) return false
    }
    return true
}