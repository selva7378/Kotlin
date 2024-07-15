package array3

/*
 *Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
 *(spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3
 *... + n, which is known to sum to exactly n*(n + 1)/2.
 *
 *
 *seriesUp(3) → [1, 1, 2, 1, 2, 3]
 *seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 *seriesUp(2) → [1, 1, 2]
 */

fun main() {
    println(seriesUp(3).contentToString())
    println(seriesUp(4).contentToString())
    println(seriesUp(2).contentToString())
}

fun seriesUp(n: Int): Array<Int> {
    val arr = Array<Int>(n * (n + 1) / 2) { 0 }
    var k = 0
    for (i in 0 until n) {
        for (j in 0..i) {
            arr[k++] = j + 1
        }
    }
    return arr
}
