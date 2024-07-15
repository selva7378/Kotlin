package string1

/*
 *Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
 *so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 *
 *lastChars("last", "chars") → "ls"
 *lastChars("yo", "java") → "ya"
 *lastChars("hi", "") → "h@"
 */

fun main() {
    println(lastChars("last", "chars"))
    println(lastChars("yo", "java"))
    println(lastChars("hi", ""))
}

fun lastChars(a: String, b: String): String {
    val first = if (a.length == 0) "@" else a[0].toString()
    val last = if (b.length == 0) "@" else b[b.length-1].toString()
    return first + last
}