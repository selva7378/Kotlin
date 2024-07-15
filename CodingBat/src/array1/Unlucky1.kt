package array1

/*
 *We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 *Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 *
 *unlucky1([1, 3, 4, 5]) → true
 *unlucky1([2, 1, 3, 4, 5]) → true
 *unlucky1([1, 1, 1]) → false
 */

fun main() {
    println(unlucky1(arrayOf(1, 3, 4, 5)))
    println(unlucky1(arrayOf(2, 1, 3, 4, 5)))
    println(unlucky1(arrayOf(1, 1, 1)))
}

fun unlucky1(nums: Array<Int>): Boolean {
    if (nums.size < 2) return false
    else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.size-2] == 1 && nums[nums.size-1] == 3)) return true
    else if (nums.size > 2 && nums[1] == 1 && nums[2] == 3) return true
    else return false
}