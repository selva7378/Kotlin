package string1

/*
 *Given a string, if a length 2 substring appears at both its beginning and end,
 *return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
 *The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 *
 *without2("HelloHe") → "lloHe"
 *without2("HelloHi") → "HelloHi"
 *without2("Hi") → ""
*/

fun main() {
    println(without2("HelloHe"))
    println(without2("HelloHi"))
    println(without2("Hi"))
}

fun without2(str: String): String =
    if (str.length < 2) str
    else if (str.substring(0, 2).equals(str.substring(str.length - 2))) str.substring(2)
    else str