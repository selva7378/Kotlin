package logic1

/*
 *Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
 *Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
 *
 *nearTen(12) → true
 *nearTen(17) → false
 *nearTen(19) → true
 */

fun main() {
    println(nearTen(12))
    println(nearTen(17))
    println(nearTen(19))
}

fun nearTen(num: Int): Boolean =
    if (num % 10 in 0..2) true
    else if (num % 10 >= 8) true
    else false