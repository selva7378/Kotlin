package string1

/*
 *Given a string, return a new string made of 3 copies of the last 2
 *chars of the original string. The string length will be at least 2.
 *
 *extraEnd("Hello") → "lololo"
 *extraEnd("ab") → "ababab"
 *extraEnd("Hi") → "HiHiHi"
 */

fun main() {
    println(extraEnd("Hello"))
    println(extraEnd("ab"))
    println(extraEnd("Hi"))
}

fun extraEnd(str: String): String =
    str.substring(str.length - 2) + str.substring(str.length - 2) + str.substring(str.length - 2)