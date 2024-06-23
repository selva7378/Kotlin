package warmup1

/*
 *Given an int n, return the absolute difference between n and 21,
 *except return double the absolute difference if n is over 21.

 *diff21(19) → 2
 *diff21(10) → 11
 *diff21(21) → 0
 */

fun main(args: Array<String>){
    println(diff21(19))
    println(diff21(10))
    println(diff21(21))
}

fun diff21(n: Int): Int = if (n > 21) 2 * n - 21 else 21 - n