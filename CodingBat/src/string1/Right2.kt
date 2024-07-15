package string1

/*
 *Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 *The string length will be at least 2.
 *
 *right2("Hello") → "loHel"
 *right2("java") → "vaja"
 *right2("Hi") → "Hi"
 */

fun main() {
    println(right2("Hello"))
    println(right2("java"))
    println(right2("Hi"))
}

fun right2(str: String): String =
    if (str.length <= 2) str
    else str.substring(str.length - 2) + str.substring(0, str.length - 2)