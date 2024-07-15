package string2

/*
 *Given a string and a non-empty word string, return a string made of each
 *char just before and just after every appearance of the word in the string.
 *Ignore cases where there is no char before or after the word, and a char may
 *be included twice if it is between two words.
 *
 *
 *wordEnds("abcXY123XYijk", "XY") → "c13i"
 *wordEnds("XY123XY", "XY") → "13"
 *wordEnds("XY1XY", "XY") → "11"
 */

fun main() {
    println(wordEnds("abcXY123XYijk", "XY"))
    println(wordEnds("XY123XY", "XY"))
    println(wordEnds("XY1XY", "XY"))
}

fun wordEnds(str: String, word: String): String {
    var res: StringBuilder = StringBuilder()
    val wordLen = word.length
    var i = 0
    while (i < str.length) {
        if (i - wordLen >= 0 && str.substring(i-wordLen, i).equals(word)){
            res.append(str[i])
        }
        if (i + (wordLen+1) <= str.length && str.substring(i+1, i + (wordLen+1)).equals(word)){
            res.append(str[i])
            i = i + 3
            continue
        }
        i++
    }
    return res.toString()
}