package string2

import kotlin.math.abs

/*
 *Given a string, does "xyz" appear in the middle of the string? To define middle,
 *we'll say that the number of chars to the left and right of the "xyz" must differ
 *by at most one. This problem is harder than it looks.
 *
 *
 *xyzMiddle("AAxyzBB") → true
 *xyzMiddle("AxyzBB") → true
 *xyzMiddle("AxyzBBB") → false
 */

fun main() {
    println(xyzMiddle("AAxyzBB"))
    println(xyzMiddle("AxyzBB"))
    println(xyzMiddle("AxyzBBB"))
}

fun xyzMiddle(str: String): Boolean {
    val middle = str.length / 2
    var start1 = middle - 1
    var start2 = middle - 2

    if (str.length < 3) {
        return false
    }

    if (str.length % 2 == 0){
        return str.substring(start1, start1+3).equals("xyz") || str.substring(start2, start2+3).equals("xyz")
    }

    return str.substring(start1, start1+3).equals("xyz")
}