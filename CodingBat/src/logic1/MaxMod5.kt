package logic1

import kotlin.math.max
import kotlin.math.min

/*
 *Given two int values, return whichever value is larger.
 *However if the two values have the same remainder when divided by 5,
 *then the return the smaller value. However, in all cases, if the two
 *values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
 *
 *
 *maxMod5(2, 3) → 3
 *maxMod5(6, 2) → 6
 *maxMod5(3, 2) → 3
 */

fun main() {
    println(maxMod5(2, 3))
    println(maxMod5(6, 2))
    println(maxMod5(3, 2))
}

fun maxMod5(a: Int, b: Int): Int{
    if (a == b) return 0
    if (a % 5 == b % 5) return min(a, b)
    return max(a , b)
}