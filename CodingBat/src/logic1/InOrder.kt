package logic1

/*
 *Given three ints, a b c, return true if b is greater than a, and c is greater than b.
 *However, with the exception that if "bOk" is true, b does not need to be greater than a.
 *
 *inOrder(1, 2, 4, false) → true
 *inOrder(1, 2, 1, false) → false
 *inOrder(1, 1, 2, true) → true
 */

fun main() {
    println(inOrder(1, 2, 4, false))
    println(inOrder(1, 2, 1, false))
    println(inOrder(1, 1, 2, true))
}

fun inOrder(a: Int, b: Int, c: Int, bOk: Boolean): Boolean {
    if (bOk && c > a) return true
    if (b > a && c > a) return true
    return false
}