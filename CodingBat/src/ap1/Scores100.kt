package ap1

/*
 *Given an array of scores, return true if there are scores of 100
 *next to each other in the array. The array length will be at least 2.
 *
 *
 *scores100([1, 100, 100]) → true
 *scores100([1, 100, 99, 100]) → false
 *scores100([100, 1, 100, 100]) → true
 */

fun main() {
    println(scores100(arrayOf(1, 100, 100)))
    println(scores100(arrayOf(1, 100, 99, 100)))
    println(scores100(arrayOf(100, 1, 100, 100)))
}

fun scores100(scores: Array<Int>): Boolean {
    for (i in 0 until scores.size - 1) {
        if (scores[i] == 100 && scores[i + 1] == 100) return true
    }
    return false
}