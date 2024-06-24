package warmup1

import kotlin.math.abs

/*
 *Given 2 int values, return whichever value is nearest to the value 10,
 *or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 *
 *close10(8, 13) → 8
 *close10(13, 8) → 8
 *close10(13, 7) → 0
 */

fun main() {
    println(close10(8, 13))
    println(close10(13, 8))
    println(close10(13, 7))
}

fun close10(a: Int, b: Int): Int {
    val diff1 = abs(a - 10)
    val diff2 = abs(b - 10)
    return if (diff1 < diff2) a else if (diff2 < diff1) b else 0
}