package kotlinPractice.array

// Second largest element in kotlin.array.

fun main() {
    println(secondLargest(arrayOf(2, 1, 4, 6, 8)))
    println(secondLargest(arrayOf(10, 5, 8, 20)))
    println(secondLargest(arrayOf(20, 10, 20, 8, 12)))
    println(secondLargest(arrayOf(10, 10, 10)))
}

fun secondLargest(nums: Array<Int>): Int {
    var largest = Int.MIN_VALUE + 1
    var secondLargest = Int.MIN_VALUE
    for (i in 0 until nums.size) {
        if (nums[i] > largest) {
            secondLargest = largest
            largest = nums[i]
        } else if (nums[i] != largest) {
            if (nums[i] > secondLargest) secondLargest = nums[i]
        }
    }
    return secondLargest
}