package string1

/*
 *Given a string, return a string length 2 made of its first 2 chars.
 *If the string length is less than 2, use '@' for the missing chars.
 *
 *atFirst("hello") → "he"
 *atFirst("hi") → "hi"
 *atFirst("h") → "h@"
 */

fun main() {
    println(atFirst("hello"))
    println(atFirst("hi"))
    println(atFirst("h"))
}

fun atFirst(str: String): String =
    if (str.length == 0) "@@"
    else if (str.length == 1) str + "@"
    else str.substring(0, 2)