package kotlinPractice.array

// Move zeros to end

fun main() {
    moveZerosToEnd(arrayOf(8, 5, 0, 10, 0, 20))
    moveZerosToEnd(arrayOf(0, 0, 0, 10, 0))
    moveZerosToEnd(arrayOf(10, 20))
}

fun moveZerosToEnd(nums: Array<Int>) {
    var count = 0
    for (i in 0 until nums.size) {
        if (nums[i] != 0){
            var temp = nums[count]
            nums[count] = nums[i]
            nums[i] = temp

            count++
        }
    }

    println(nums.contentToString())
}