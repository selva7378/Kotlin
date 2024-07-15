package logic1

/*
 *Given 2 non-negative ints, a and b, return their sum, so long as the
 *sum has the same number of digits as a. If the sum has more digits
 *than a, just return a without b. (Note: one way to compute the number
 *of digits of a non-negative int n is to convert it to a string with
 *String.valueOf(n) and then check the length of the string.)
 *
 *
 *sumLimit(2, 3) → 5
 *sumLimit(8, 3) → 8
 *sumLimit(8, 1) → 9
 */

fun main() {
    println(sumLimit(2, 3))
    println(sumLimit(8, 3))
    println(sumLimit(8, 1))
}

fun sumLimit(a: Int, b: Int): Int {
    val aDigit = a.toString().length
    val sumDigit = (a + b).toString().length
    if (aDigit == sumDigit) return  a + b
    return a
}