package array2

/*
 *We'll say that an element in an array is "alone" if there are values before and after it,
 *and those values are different from it. Return a version of the given array where every
 *instance of the given value which is alone is replaced by whichever value to its left or right is larger.
 *
 *
 *notAlone([1, 2, 3], 2) → [1, 3, 3]
 *notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
 *notAlone([3, 4], 3) → [3, 4]
 */

fun main() {
    println(notAlone(arrayOf(1, 2, 3), 2).contentToString())
    println(notAlone(arrayOf(1, 2, 3, 2, 5, 2), 2).contentToString())
    println(notAlone(arrayOf(3, 4), 3).contentToString())
}

fun notAlone(nums: Array<Int>, value: Int): Array<Int> {
    for (i in 1..nums.size - 2) {
        if (nums[i] == value && nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {
            nums[i] = maxOf(nums[i - 1], nums[i + 1])
        }
    }
    return nums
}