package warmup1

/*
 *Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 *
 *nearHundred(93) → true
 *nearHundred(90) → true
 *nearHundred(89) → false
 */

fun main(args: Array<String>) {
    println(nearHundred(93))
    println(nearHundred(90))
    println(nearHundred(89))
}

fun nearHundred(n: Int): Boolean =
    (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10)
