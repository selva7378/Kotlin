package string1

/*
 *Given a string and a second "word" string, we'll say that the word matches the string
 *if it appears at the front of the string, except its first char does not need to match exactly.
 *On a match, return the front of the string, or otherwise return the empty string.
 *So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
 *
 *startWord("hippo", "hi") → "hi"
 *startWord("hippo", "xip") → "hip"
 *startWord("hippo", "i") → "h"
 */

fun main() {
    println(startWord("hippo", "hi"))
    println(startWord("hippo", "xip"))
    println(startWord("hippo", "i"))
}

fun startWord(str: String, word: String): String =
    if (str.length < word.length || str.length == 0) ""
    else if (word.length == 1) str.substring(0, 1)
    else if (str.substring(1, word.length).equals(word.substring(1))) str.substring(0, word.length)
    else ""