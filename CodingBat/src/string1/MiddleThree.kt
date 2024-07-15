package string1

/*
 *Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 *The string length will be at least 3.
 *
 *middleThree("Candy") → "and"
 *middleThree("and") → "and"
 *middleThree("solving") → "lvi"
 */

fun main() {
    println(middleThree("Candy"))
    println(middleThree("and"))
    println(middleThree("solving"))
}

fun middleThree(str: String): String {
    val midPoint = str.length / 2
    return str.substring(midPoint-1, midPoint + 2)
}