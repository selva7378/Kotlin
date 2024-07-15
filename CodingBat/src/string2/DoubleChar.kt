package string2

/*
 *Given a string, return a string where for every char in the original, there are two chars.
 *
 *
 *doubleChar("The") → "TThhee"
 *doubleChar("AAbb") → "AAAAbbbb"
 *doubleChar("Hi-There") → "HHii--TThheerree"
 */

fun main() {
    println(doubleChar("The"))
    println(doubleChar("AAbb"))
    println(doubleChar("Hi-There"))
}

fun doubleChar(str: String): String {
    var res: StringBuilder = StringBuilder()
    for (char in str) {
        res.append(char).append(char)
    }
    return res.toString()
}