package array

fun main() {
    println(isSorted(arrayOf(1, 2, 3, 4, 5)))
    println(isSorted(arrayOf(1, 2, 3, 4, 0)))
    println(isSorted(arrayOf(5, 4, 3, 2, 1)))
}

fun isSorted(nums: Array<Int>): Boolean {
    var isAscendingOrder: Boolean
    if (nums.size < 2) return true
    else {
        isAscendingOrder = if (nums[0] < nums[1]) true else false
        if (isAscendingOrder) {
            for (i in 0 until nums.size - 1) {
                if (nums[i] > nums[i + 1]) return false
            }
        } else {
            for (i in 0 until nums.size - 1) {
                if (nums[i] < nums[i + 1]) return false
            }
        }
    }
    return true
}