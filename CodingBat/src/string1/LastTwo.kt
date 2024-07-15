package string1

/*
 *Given a string of any length, return a new string where the last 2 chars,
 *if present, are swapped, so "coding" yields "codign".
 *
 *lastTwo("coding") → "codign"
 *lastTwo("cat") → "cta"
 *lastTwo("ab") → "ba"
 */

fun main() {
    println(lastTwo("coding"))
    println(lastTwo("cat"))
    println(lastTwo("ab"))
}

fun lastTwo(str: String): String =
    if (str.length < 2) str
    else str.substring(0, str.length - 2) + str[str.length - 1] + str[str.length - 2]