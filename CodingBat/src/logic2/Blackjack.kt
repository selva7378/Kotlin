package logic2

/*
 *Given 2 int values greater than 0, return whichever value is nearest
 *to 21 without going over. Return 0 if they both go over.
 *
 *
 *blackjack(19, 21) → 21
 *blackjack(21, 19) → 21
 *blackjack(19, 22) → 19
 */

fun main() {
    println(blackjack(19, 21))
    println(blackjack(21, 19))
    println(blackjack(19, 22))
}

fun blackjack(a: Int, b: Int) =
    if (a > 21 && b > 21) 0
    else if (a > 21) b
    else if (b > 21) a
    else if (a > b) a else b
