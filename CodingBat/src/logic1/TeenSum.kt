package logic1

/*
 *Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
 *inclusive, are extra lucky. So if either value is a teen, just return 19.
 *
 *teenSum(3, 4) → 7
 *teenSum(10, 13) → 19
 *teenSum(13, 2) → 19
 */

fun main() {
    println(teenSum(3, 4))
    println(teenSum(10, 13))
    println(teenSum(13, 2))
}

fun teenSum(a: Int, b: Int): Int =
    if (a in 13..19 || b in 13..19) 19
    else a + b