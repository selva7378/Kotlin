package warmup1

/*
 *Given two non-negative int values, return true if they have the same last digit,
 *such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 *
 *lastDigit(7, 17) → true
 *lastDigit(6, 17) → false
 *lastDigit(3, 113) → true
 */

fun main() {
    println(lastDigit(7, 17))
    println(lastDigit(6, 17))
    println(lastDigit(3, 113))
}

fun lastDigit(a: Int, b: Int): Boolean = a % 10 == b % 10