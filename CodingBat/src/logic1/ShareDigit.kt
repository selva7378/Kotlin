package logic1

/*
 *Given two ints, each in the range 10..99, return true if there is a digit
 *that appears in both numbers, such as the 2 in 12 and 23.
 *(Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
 *
 *
 *shareDigit(12, 23) → true
 *shareDigit(12, 43) → false
 *shareDigit(12, 44) → false
 */

fun main() {
    println(shareDigit(12, 23))
    println(shareDigit(12, 43))
    println(shareDigit(12, 44))
}

fun shareDigit(a: Int, b: Int): Boolean {
    val a1 = a / 10
    val a2 = a % 10
    val b1 = b / 10
    val b2 = b % 10

    return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2
}