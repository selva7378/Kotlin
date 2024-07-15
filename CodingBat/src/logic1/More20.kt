package logic1

/*
 *Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
 *See also: Introduction to Mod
 *
 *more20(20) → false
 *more20(21) → true
 *more20(22) → true
 */

fun main() {
    println(more20(20))
    println(more20(21))
    println(more20(22))
}

fun more20(n: Int): Boolean = n % 20 in 1..2