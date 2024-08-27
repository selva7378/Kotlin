package kotlinPractice.array

// Find the largest element in the kotlin.array.

fun main() {
    largestElement(arrayOf(5, 8, 20, 10))
}

fun largestElement(numsArr: Array<Int>) {
    var largest = Int.MIN_VALUE
    for (num in numsArr) {
        if (num > largest) largest = num
    }
    println("The largest number in the give kotlin.array is : $largest")
}