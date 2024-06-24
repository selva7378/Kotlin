package warmup1

/*
 *We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 *Given 2 int values, return true if one or the other is teen, but not both.
 *
 *loneTeen(13, 99) → true
 *loneTeen(21, 19) → true
 *loneTeen(13, 13) → false
 */
fun main() {
    println(loneTeen(13, 99))
    println(loneTeen(21, 19))
    println(loneTeen(13, 13))
}

fun loneTeen(a: Int, b: Int): Boolean = (a in 13..19 && b !in 13..19) || (b in 13..19 && a !in 13..19)