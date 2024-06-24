package warmup1

/*
 *We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 *Given 3 int values, return true if 1 or more of them are teen.
 *
 *hasTeen(13, 20, 10) → true
 *hasTeen(20, 19, 10) → true
 *hasTeen(20, 10, 13) → true
 */

fun main() {
    println(hasTeen(13, 20, 10))
    println(hasTeen(20, 19, 10))
    println(hasTeen(20, 10, 13))
}

fun hasTeen(a: Int, b: Int, c: Int): Boolean = a in 13..19 || b in 13..19 || c in 13..19