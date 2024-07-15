package string1

/*
 *Given two strings, append them together (known as "concatenation") and return the result.
 *However, if the strings are different lengths, omit chars from the longer string so it
 *is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 *
 *minCat("Hello", "Hi") → "loHi"
 *minCat("Hello", "java") → "ellojava"
 *minCat("java", "Hello") → "javaello"
 */

fun main() {
    println(minCat("Hello", "Hi"))
    println(minCat("Hello", "java"))
    println(minCat("java", "Hello"))
}

fun minCat(a: String, b: String): String =
    if (a.length > b.length) a.substring(a.length - b.length) + b
    else if (b.length > a.length) a + b.substring(b.length - a.length)
    else a + b