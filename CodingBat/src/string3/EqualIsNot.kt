package string3

/*
 *Given a string, return true if the number of appearances of "is" anywhere
 *in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 *
 *
 *equalIsNot("This is not") → false
 *equalIsNot("This is notnot") → true
 *equalIsNot("noisxxnotyynotxisi") → true
 */

fun main() {
    println(equalIsNot("This is not"))
    println(equalIsNot("This is notnot"))
    println(equalIsNot("noisxxnotyynotxisi"))
}

fun equalIsNot(str: String): Boolean {
    var isCount = 0
    var notCount = 0
    labelDemo@for(i in 0..str.length-1) {
        if (i + 2 <= str.length && str.substring(i, i+2).equals("is")) {
            isCount++
            continue@labelDemo
        }

        if (i + 3 <= str.length && str.substring(i, i+3).equals("not")) {
            notCount++
        }
    }
    return isCount == notCount
}
