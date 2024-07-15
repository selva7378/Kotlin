package array2

/*
 *Return true if the group of N numbers at the start and end of the array are the same.
 *For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
 *and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
 *
 *
 *sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
 *sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
 *sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 */
fun main() {
    println(sameEnds(arrayOf(5, 6, 45, 99, 13, 5, 6), 1))
    println(sameEnds(arrayOf(5, 6, 45, 99, 13, 5, 6), 2))
    println(sameEnds(arrayOf(5, 6, 45, 99, 13, 5, 6), 3))
}

fun sameEnds(nums: Array<Int>, len: Int): Boolean {

    if (nums.size == 0 && len > 0) return false
    var i = 0
    var j = nums.size - len
    while(i < len) {
        if (nums[i] != nums[j]) return false
        i++
        j++
    }
    return true
}