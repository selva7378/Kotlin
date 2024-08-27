package kotlinPractice.array

// Remove Duplicates from the sorted kotlin.array.

fun main() {
    removeDuplicates(arrayOf(10, 20, 20, 30, 30, 30))
    removeDuplicates(arrayOf(1, 2, 3, 4, 4, 5))
    removeDuplicates(arrayOf(5, 5, 4, 3, 2, 2, 1))
}

fun removeDuplicates(nums: Array<Int>) {
    var i = 0
    var j = 0
    while (i < nums.size) {
        if (nums[j] != nums[i]) {
            nums[j+1] = nums[i]
            j++
        }
        i++
    }


    for (i in 0..j) {
        print("${nums[i]} ")
    }
    println()
}
