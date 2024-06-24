package warmup1

/*
 *Given three int values, a b c, return the largest.
 *
 *intMax(1, 2, 3) → 3
 *intMax(1, 3, 2) → 3
 *intMax(4, 2, 1) → 4
 */

fun main() {
    println(intMax(1, 2, 3))
    println(intMax(1, 3, 2))
    println(intMax(4, 2, 1))
}

fun intMax(a: Int, b: Int, c: Int): Int = maxOf(a, b, c)