package ap1

/*
 *Given an array of scores, compute the int average of the first half and
 *the second half, and return whichever is larger. We'll say that the second
 *half begins at index length/2. The array length will be at least 2.
 *To practice decomposition, write a separate helper method
 *int average(int[] scores, int start, int end) { which computes the average
 *of the elements between indexes start..end. Call your helper method twice to
 *implement scoresAverage(). Write your helper method after your scoresAverage()
 *method in the JavaBat text area. Normally you would compute averages with doubles,
 *but here we use ints so the expected results are exact.
 *
 *scoresAverage([2, 2, 4, 4]) → 4
 *scoresAverage([4, 4, 4, 2, 2, 2]) → 4
 *scoresAverage([3, 4, 5, 1, 2, 3]) → 4
 */


fun main() {
    println(scoresAverage(arrayOf(2, 2, 4, 4)))
    println(scoresAverage(arrayOf(4, 4, 4, 2, 2, 2)))
    println(scoresAverage(arrayOf(3, 4, 5, 1, 2, 3)))
}

fun scoresAverage(scores: Array<Int>): Int {
    val firstHalfAvg = average(scores, 0, scores.size/2 - 1)
    val secondtHalfAvg = average(scores, scores.size/2 , scores.size-1)
     return if (firstHalfAvg > secondtHalfAvg) firstHalfAvg else secondtHalfAvg
}

fun average(scores: Array<Int>, start: Int, end: Int): Int {
    var count = end - start + 1
    var totalSum = 0
    for(i in start..end) {
        totalSum += scores[i]
    }
    return totalSum / count
}