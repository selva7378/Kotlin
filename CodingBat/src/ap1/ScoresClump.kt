package ap1

import kotlin.math.abs

/*
 *Given an array of scores sorted in increasing order, return true if the
 *array contains 3 adjacent scores that differ from each other by at most 2,
 *such as with {3, 4, 5} or {3, 5, 5}.
 *
 *
 *scoresClump([3, 4, 5]) → true
 *scoresClump([3, 4, 6]) → false
 *scoresClump([1, 3, 5, 5]) → true
 */

fun main() {
    println(scoresClump(arrayOf(3, 4, 5)))
    println(scoresClump(arrayOf(3, 4, 6)))
    println(scoresClump(arrayOf(1, 3, 5, 5)))
}

fun scoresClump(scores: Array<Int>): Boolean {
    for (i in 0 until scores.size-2) {
        if (abs(scores[i] - scores[i + 1]) <= 2 && abs(scores[i+1] - scores[i + 2]) <= 2 &&
            abs(scores[i] - scores[i + 2]) <= 2) return true
    }
    return false
}