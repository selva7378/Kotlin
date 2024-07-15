package string1

/*
 *Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
 *The string length will be at least 2.
 *
 *left2("Hello") → "lloHe"
 *left2("java") → "vaja"
 *left2("Hi") → "Hi"
 */

fun main() {
    println(left2("Hello"))
    println(left2("java"))
    println(left2("Hi"))
}

fun left2(str: String): String =
    if (str.length <= 2) str
else str.substring(2) + str.substring(0, 2)