package string1

/*
 *Given a string of even length, return a string made of the middle two chars,
 *so the string "string" yields "ri". The string length will be at least 2.
 *
 *middleTwo("string") → "ri"
 *middleTwo("code") → "od"
 *middleTwo("Practice") → "ct"
 */

fun main() {
    println(middleTwo("string"))
    println(middleTwo("code"))
    println(middleTwo("Practice"))
}

fun middleTwo(str: String): String {
    val mid: Int = str.length / 2 - 1
    return str.substring(mid, mid + 2)
}