package string1

/*
 *Given a string, return a version without both the first and last char of the string.
 *The string may be any length, including 0.
 *
 *withouEnd2("Hello") → "ell"
 *withouEnd2("abc") → "b"
 *withouEnd2("ab") → ""
 */

fun main() {
    println(withouEnd2("Hello"))
    println(withouEnd2("abc"))
    println(withouEnd2("ab"))
}

fun withouEnd2(str: String): String =
    if (str.length <= 2) ""
    else str.substring(1, str.length - 1)