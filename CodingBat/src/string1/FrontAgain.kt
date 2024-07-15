package string1

/*
 *Given a string, return true if the first 2 chars in the
 *string also appear at the end of the string, such as with "edited".
 *
 *frontAgain("edited") → true
 *frontAgain("edit") → false
 *frontAgain("ed") → true
 */

fun main() {
    println(frontAgain("edited"))
    println(frontAgain("edit"))
    println(frontAgain("ed"))
}

fun frontAgain(str: String): Boolean =
    if (str.length < 2) false
    else if (str.substring(0, 2).equals(str.substring(str.length - 2))) true
    else false