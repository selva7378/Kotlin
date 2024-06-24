package warmup1

import kotlin.math.max

/*
 *Given a string, return a new string where the last 3 chars are now in upper case.
 *If the string has less than 3 chars, uppercase whatever is there.
 *Note that str.toUpperCase() returns the uppercase version of a string.
 *
 *endUp("Hello") → "HeLLO"
 *endUp("hi there") → "hi thERE"
 *endUp("hi") → "HI"
*/
fun main() {
    println(endUp("Hello"))
    println(endUp("hi there"))
    println(endUp("hi"))
}

fun endUp(str: String): String =
    if (str.length < 3) str.uppercase()
    else str.substring(0, str.length - 3) + str.substring(str.length - 3).uppercase()