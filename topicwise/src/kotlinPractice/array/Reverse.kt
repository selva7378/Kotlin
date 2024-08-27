package kotlinPractice.array

// Reverse an kotlin.array

fun main() {
    reverse(arrayOf(5, 4, 3, 2, 1))
    reverse(arrayOf(1, 2, 3, 4, 5))
}

fun reverse(nums: Array<Int>) {
    var first = 0
    var last = nums.size - 1
    while (first < last) {
        var temp = nums[first]
        nums[first] = nums[last]
        nums[last] = temp
        first++
        last--
    }
    printArray(nums)
}

fun printArray(nums: Array<Int>) {
    for (num in nums){
        print("$num ")
    }
    println()
}