package string1

/*
 *Given a string, return a version without the first and last char, so "Hello" yields "ell".
 *The string length will be at least 2.
 *
 *withoutEnd("Hello") → "ell"
 *withoutEnd("java") → "av"
 *withoutEnd("coding") → "odin"
 */

fun main() {
    println(withoutEnd("Hello"))
    println(withoutEnd("java"))
    println(withoutEnd("coding"))
    println(withoutEnd("se"))
}

fun withoutEnd(str: String): String = str.substring(1, str.length-1)