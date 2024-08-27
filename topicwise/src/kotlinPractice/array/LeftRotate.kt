package kotlinPractice.array

fun main() {
    leftRotate(arrayOf(1, 2, 3, 4, 5), 2)
    leftRotate(arrayOf(10, 5, 30, 15), 3)
}

fun leftRotate(nums: Array<Int>, d: Int) {
    var d = d % nums.size
    reverse(nums, 0, d-1)
    reverse(nums, d, nums.size-1)
    reverse(nums, 0, nums.size-1)

    println(nums.contentToString())
}

fun reverse(nums: Array<Int>, start: Int, end: Int) {
    var start = start
    var end = end
    while (start < end) {
        var temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}