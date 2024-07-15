package array2

/*
 *Return an array that contains the exact same numbers as the given array,
 *but rearranged so that all the zeros are grouped at the start of the array.
 *The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
 *You may modify and return the given array or make a new array.
 *
 *
 *zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
 *zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
 *zeroFront([1, 0]) → [0, 1]
 */

fun main() {
    println(zeroFront(arrayOf(1, 0, 0, 1)).contentToString())
    println(zeroFront(arrayOf(0, 1, 1, 0, 1)).contentToString())
    println(zeroFront(arrayOf(1, 0)).contentToString())
}

fun zeroFront(nums: Array<Int>): Array<Int> {
    var i = 0
    var j = 0
    while (i < nums.size) {
        if (nums[i] == 0) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            j++
        }
        i++
    }
    return nums
}
