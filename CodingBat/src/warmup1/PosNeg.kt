package warmup1


/*
 *Given 2 int values, return true if one is negative and one is positive.
 *Except if the parameter "negative" is true, then return true only if both are negative.
 *
 *posNeg(1, -1, false) → true
 *posNeg(-1, 1, false) → true
 *posNeg(-4, -5, true) → true
 */

fun main(args: Array<String>) {
    println(posNeg(1, -1, false))
    println(posNeg(-1, 1, false))
    println(posNeg(-4, -5, true))
}

fun posNeg(a: Int, b: Int, negative: Boolean): Boolean =
    if (negative && a < 0 && b < 0) true
    else if (!negative && (a < 0 && b > 0) || (a > 0 && b < 0)) true
    else false