package string2

/*
 *Given a string, consider the prefix string made of the first N chars of the string.
 *Does that prefix string appear somewhere else in the string? Assume that the string
 *is not empty and that N is in the range 1..str.length().
 *
 *
 *prefixAgain("abXYabc", 1) → true
 *prefixAgain("abXYabc", 2) → true
 *prefixAgain("abXYabc", 3) → false
 */


fun main() {
    println(prefixAgain("abXYabc", 1))
    println(prefixAgain("abXYabc", 2))
    println(prefixAgain("abXYabc", 3))
}

fun prefixAgain(str: String, n: Int): Boolean {
    val prefix = str.substring(0, n)
    for (i in n..str.length-3){
        if (str.substring(i, i+n).equals(prefix)) return true
    }
    return false
}