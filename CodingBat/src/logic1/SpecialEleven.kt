package logic1

/*
 *We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 *Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
 *
 *specialEleven(22) → true
 *specialEleven(23) → true
 *specialEleven(24) → false
 */

fun main() {
    println(specialEleven(22))
    println(specialEleven(23))
    println(specialEleven(24))
}

fun specialEleven(n: Int): Boolean = n % 11 in 0..1