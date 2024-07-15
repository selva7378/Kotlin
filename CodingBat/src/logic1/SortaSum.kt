package logic1

/*
 *Given 2 ints, a and b, return their sum.
 *However, sums in the range 10..19 inclusive,
 *are forbidden, so in that case just return 20.
 *
 *sortaSum(3, 4) → 7
 *sortaSum(9, 4) → 20
 *sortaSum(10, 11) → 21
 */
fun main() {
    println(sortaSum(3, 4))
    println(sortaSum(9, 4))
    println(sortaSum(10, 11))
}

fun sortaSum(a: Int, b: Int): Int =
    if (a + b in 10..19) 20
    else a + b