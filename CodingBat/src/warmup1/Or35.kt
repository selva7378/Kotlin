package warmup1

/*
 Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 Use the % "mod" operator -- see Introduction to Mod

 or35(3) → true
 or35(10) → true
 or35(8) → false
 */

fun main() {
    println(or35(3))
    println(or35(10))
    println(or35(8))
}

fun or35(num: Int): Boolean = num % 3 == 0 || num % 5 == 0