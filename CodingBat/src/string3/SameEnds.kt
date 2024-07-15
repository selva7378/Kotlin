package string3

/*
 *Given a string, return the longest substring that appears at both the
 *beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 *
 *
 *sameEnds("abXYab") → "ab"
 *sameEnds("xx") → "x"
 *sameEnds("xxx") → "x"
 *sameEnds("javajava") → "java"
 */

fun main() {
    println(sameEnds("abXYab"))
    println(sameEnds("xx"))
    println(sameEnds("xxx"))
    println(sameEnds("javajava"))
}

fun sameEnds(str: String): String {
    var res: StringBuilder = StringBuilder()
    var i = 1
    var j = str.length-1
    while ( i <= j) {
        if (str.substring(0,i).equals(str.substring(j))){
            res.append(str.substring(j))
        }
        i++
        j--
    }
    return res.toString()
}