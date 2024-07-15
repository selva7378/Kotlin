package logic1

/*
 *Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 *So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
 *
 *
 *less20(18) → true
 *less20(19) → true
 *less20(20) → false
 */

fun main() {
    println(less20(18))
    println(less20(19))
    println(less20(20))
}

fun less20(n: Int): Boolean = n % 20 in 8..9