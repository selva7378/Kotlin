package array3

/*
 *Given n>=0, create an array length n*n with the following pattern,
 *shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 *
 *
 *squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
 *squareUp(2) → [0, 1, 2, 1]
 *squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */

fun main() {
    println(squareUp(3).contentToString())
    println(squareUp(2).contentToString())
    println(squareUp(4).contentToString())
}

fun squareUp(n: Int): Array<Int> {
    val arr = Array<Int>(n * n) { 0 }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (j < n - i - 1) continue
            arr[i * n + j] = n - j
        }
    }
    return arr
}