package string1

/*
 *Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 *
 *firstHalf("WooHoo") → "Woo"
 *firstHalf("HelloThere") → "Hello"
 *firstHalf("abcdef") → "abc"
 */

fun main() {
    println(firstHalf("WooHoo"))
    println(firstHalf("HelloThere"))
    println(firstHalf("abcdef"))
}

fun firstHalf(str: String): String = str.substring(0, str.length / 2)