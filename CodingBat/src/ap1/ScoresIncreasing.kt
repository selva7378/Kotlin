package ap1

/*
 *Given an array of scores, return true if each score is equal or greater
 *than the one before. The array will be length 2 or more.
 *
 *
 *scoresIncreasing([1, 3, 4]) → true
 *scoresIncreasing([1, 3, 2]) → false
 *scoresIncreasing([1, 1, 4]) → true
 */

fun main() {
    println(scoresIncreasing(arrayOf(1, 3, 4)))
    println(scoresIncreasing(arrayOf(1, 3, 2)))
    println(scoresIncreasing(arrayOf(1, 1, 4)))
}

fun scoresIncreasing(scores: Array<Int>): Boolean {
    for (i in 0 until scores.size - 1) {
        if (scores[i] > scores[i + 1]) return false
    }
    return true
}