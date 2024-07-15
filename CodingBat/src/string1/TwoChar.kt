package string1

/*
 *Given a string and an index, return a string length 2 starting at the given index.
 *If the index is too big or too small to define a string length 2, use the first 2 chars.
 *The string length will be at least 2.
 *
 *twoChar("java", 0) → "ja"
 *twoChar("java", 2) → "va"
 *twoChar("java", 3) → "ja"
 */

fun main() {
    println(twoChar("java", 0))
    println(twoChar("java", 2))
    println(twoChar("java", 3))
}

fun twoChar(str: String, index: Int): String =
    if (index + 2 > str.length || index < 0) str.substring(0, 2)
else str.substring(index, index + 2)