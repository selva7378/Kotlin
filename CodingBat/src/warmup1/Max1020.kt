package warmup1

/*
 *Given 2 positive int values, return the larger value that is in the
 *  range 10..20 inclusive, or return 0 if neither is in that range.
 *
 *max1020(11, 19) → 19
 *max1020(19, 11) → 19
 *max1020(11, 9) → 11
 */

fun main() {
    println(max1020(11, 19))
    println(max1020(19, 11))
    println(max1020(11, 9))
}

fun max1020(a: Int, b: Int): Int =
    if (a in 10..20 && b in 10..20) {
        if (a > b) a else b
    } else if (a in 10..20) a
    else if (b in 10..20) b
    else 0