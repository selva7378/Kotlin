package string2

/*
 *Given a string and a non-empty word string, return a version of the
 *original String where all chars have been replaced by pluses ("+"),
 *except for appearances of the word string which are preserved unchanged.
 *
 *
 *plusOut("12xy34", "xy") → "++xy++"
 *plusOut("12xy34", "1") → "1+++++"
 *plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

fun main() {
    println(plusOut("12xy34", "xy"))
    println(plusOut("12xy34", "1"))
    println(plusOut("12xy34xyabcxy", "xy"))
}

fun plusOut(str: String, word: String): String {
    var res: StringBuilder = StringBuilder(str)
    var wordLen = word.length
    var i = 0
    while (i < str.length) {
        if (i + wordLen <= str.length && str.substring(i, i + wordLen).equals(word)) {
            i = i + wordLen
            continue
        }
        res[i] = '+'
        i++
    }
    return res.toString()
}