package string1

/*
 *Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 *such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
 *Note: use .equals() to compare 2 strings.
 *
 *hasBad("badxx") → true
 *hasBad("xbadxx") → true
 *hasBad("xxbadxx") → false
 */

fun main() {
    println(hasBad("badxx"))
    println(hasBad("xbadxx"))
    println(hasBad("xxbadxx"))
}

fun hasBad(str: String): Boolean =
    if (str.length < 3) false
    else if (str.substring(0, 3).equals("bad")) true
    else if (str.length > 3) str.substring(1, 4).equals("bad")
    else false