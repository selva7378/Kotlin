package logic1

import kotlin.math.abs

/*
 *Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 *
 *lessBy10(1, 7, 11) → true
 *lessBy10(1, 7, 10) → false
 *lessBy10(11, 1, 7) → true
 */

fun main() {
    println(lessBy10(1, 7, 11))
    println(lessBy10(1, 7, 10))
    println(lessBy10(11, 1, 7))
}

fun lessBy10(a: Int, b: Int, c: Int): Boolean = abs(a - b) >= 10 || abs(b - c) >= 10 || abs(c - a) >= 10