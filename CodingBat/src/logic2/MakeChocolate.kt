package logic2

/*
 *We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
 *and big bars (5 kilos each). Return the number of small bars to use, assuming we always
 *use big bars before small bars. Return -1 if it can't be done.
 *
 *
 *makeChocolate(4, 1, 9) → 4
 *makeChocolate(4, 1, 10) → -1
 *makeChocolate(4, 1, 7) → 2
 */

fun main() {
    println(makeChocolate(4, 1, 9))
    println(makeChocolate(4, 1, 10))
    println(makeChocolate(4, 1, 7))
}

fun makeChocolate(small: Int, big: Int, goal: Int): Int {
    var rem = if (big * 5 < goal) goal - big * 5 else goal % 5
    return if (small < rem) -1 else rem
}