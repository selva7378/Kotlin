package warmup1

/*
 *Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 *
 *makes10(9, 10) → true
 *makes10(9, 9) → false
 *makes10(1, 9) → true
 */
fun main(args: Array<String>) {
    println(makes10(9, 10))
    println(makes10(9, 9))
    println(makes10(1, 9))
}

fun makes10(a: Int, b: Int): Boolean =
    (a == 10 || b == 10 || (a + b) == 10)