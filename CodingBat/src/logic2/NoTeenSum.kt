package logic2

/*
 *Given 3 int values, a b c, return their sum. However, if any of the values is a teen
 *-- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do
 *not count as a teens. Write a separate helper "public int fixTeen(int n)
 *{"that takes in an int value and returns that value fixed for the teen rule. In this way,
 *you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below
 *and at the same indent level as the main noTeenSum().
 *
 *
 *noTeenSum(1, 2, 3) → 6
 *noTeenSum(2, 13, 1) → 3
 *noTeenSum(2, 1, 14) → 3
 */

fun main() {
    println(noTeenSum(1, 2, 3))
    println(noTeenSum(2, 13, 1))
    println(noTeenSum(2, 1, 14))
}

fun noTeenSum(a: Int, b: Int, c: Int): Int = fixTeen(a) + fixTeen(b) + fixTeen(c)

fun fixTeen(n: Int): Int =
    if (n in 13..19 && n !in 15..16) 0
    else n