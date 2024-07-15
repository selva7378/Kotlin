package logic2

import kotlin.math.abs

/*
 *Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
 *while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num)
 *computes the absolute value of a number.
 *
 *
 *closeFar(1, 2, 10) → true
 *closeFar(1, 2, 3) → false
 *closeFar(4, 1, 3) → true
 */

fun main() {
    println(closeFar(1, 2, 10))
    println(closeFar(1, 2, 3))
    println(closeFar(4, 1, 3))
}

fun closeFar(a: Int, b: Int, c: Int): Boolean = (isClose(a, b) && isFar(c, a, b)) || (isClose(a, c) && isFar(b, a, c))

fun isClose(a: Int, borc: Int): Boolean = abs(a - borc) <= 1

fun isFar(far: Int, a: Int, b: Int): Boolean = abs(far - a) >= 2 && abs(far - b) >= 2