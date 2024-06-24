package warmup1

/*
 *Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 *
 *in1020(12, 99) → true
 *in1020(21, 12) → true
 *in1020(8, 99) → false
 */

fun main() {
    println(in1020(12, 99))
    println(in1020(21, 12))
    println(in1020(8, 99))
}

fun in1020(a: Int, b: Int): Boolean = a in 10..20 || b in 10..20