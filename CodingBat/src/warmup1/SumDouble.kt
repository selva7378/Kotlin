package warmup1

/*
 *Given two int values, return their sum. Unless the two values are the same, then return double their sum.

 *sumDouble(1, 2) → 3
 *sumDouble(3, 2) → 5
 *sumDouble(2, 2) → 8
 */

fun main() {
    println(sumDouble(1, 2))
    println(sumDouble(3, 2))
    println(sumDouble(2, 2))
}

fun sumDouble(a: Int, b: Int): Int =
    if (a != b) a + b else 2 * (a + b)