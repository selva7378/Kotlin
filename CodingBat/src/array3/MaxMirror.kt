package array3

/*
 *We'll say that a "mirror" section in an array is a group of contiguous
 *elements such that somewhere in the array, the same group appears in
 *reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
 *is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
 *
 *
 *maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
 *maxMirror([1, 2, 1, 4]) → 3
 *maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 */

fun main() {
    println(maxMirror(arrayOf(1, 2, 3, 8, 9, 3, 2, 1)))
    println(maxMirror(arrayOf(1, 2, 1, 4)))
    println(maxMirror(arrayOf(7, 1, 2, 9, 7, 2, 1)))
}

fun maxMirror(nums: Array<Int>): Int {
    var maxMirror = 0
    for (i in 0 until nums.size) {
        var count = 0
        for (j in nums.size - 1 downTo i) {
            if (nums[i + count] == nums[j]) {
                count++
            }else {
                maxMirror = maxOf(count, maxMirror)
                count = 0
            }
        }
        maxMirror = maxOf(count, maxMirror)
    }
    return maxMirror
}