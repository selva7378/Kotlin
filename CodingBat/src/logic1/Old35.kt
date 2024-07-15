package logic1

/*
 *Return true if the given non-negative number is a multiple of 3 or 5,
 *but not both. Use the % "mod" operator -- see Introduction to Mod
 *
 *old35(3) → true
 *old35(10) → true
 *old35(15) → false
 */

fun main() {
    println(old35(3))
    println(old35(10))
    println(old35(15))
}

fun old35(n: Int): Boolean =
    if (n % 3 == 0 && n % 5 == 0) false
    else if (n % 3 == 0 || n % 5 == 0) true
    else false
