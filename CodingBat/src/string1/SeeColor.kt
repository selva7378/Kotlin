package string1

/*
 *Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 *
 *seeColor("redxx") → "red"
 *seeColor("xxred") → ""
 *seeColor("blueTimes") → "blue"
 */

fun main() {
    println(seeColor("redxx"))
    println(seeColor("xxred"))
    println(seeColor("blueTimes"))

    println()

    println(seeColor1("redxx"))
    println(seeColor1("xxred"))
    println(seeColor1("blueTimes"))
}

fun seeColor(str: String): String =
    if (str.length >= 3 && str.substring(0, 3).equals("red")) "red"
    else if (str.length >= 4 && str.substring(0, 4).equals("blue")) "blue"
    else ""

fun seeColor1(str: String): String =
    if (str.startsWith("red")) "red"
    else if (str.startsWith("blue")) "blue"
    else ""