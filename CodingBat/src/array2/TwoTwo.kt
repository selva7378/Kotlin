package array2

/*
 *Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 *
 *
 *twoTwo([4, 2, 2, 3]) → true
 *twoTwo([2, 2, 4]) → true
 *twoTwo([2, 2, 4, 2]) → false
 */

fun main() {
    println(twoTwo(arrayOf(4, 2, 2, 3)))
    println(twoTwo(arrayOf(2, 2, 4)))
    println(twoTwo(arrayOf(2, 2, 4, 2)))
}

fun twoTwo(nums: Array<Int>): Boolean {
    var len = nums.size
    for(i in 0 until len){
        if(i-1 < 0 && i + 1 >= len && nums[i] == 2) return false
        if(nums[i] == 2 && ((i - 1 >= 0 && nums[i-1] != 2) && (i + 1 < len && nums[i + 1] != 2))) return false
        if(i - 1 >= 0 && i + 1 >= len && nums[i-1] != 2 && nums[i] == 2) return false
        if(i + 1 < len && i - 1 < 0 && nums[i+1] != 2 && nums[i] == 2) return false
    }
    return true
}


