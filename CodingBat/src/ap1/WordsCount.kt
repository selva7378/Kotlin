package ap1

/*
 *Given an array of strings, return the count of the number of strings with the given length.
 *
 *
 *wordsCount(["a", "bb", "b", "ccc"], 1) → 2
 *wordsCount(["a", "bb", "b", "ccc"], 3) → 1
 *wordsCount(["a", "bb", "b", "ccc"], 4) → 0
 */

fun main() {
    println(wordsCount(arrayOf("a", "bb", "b", "ccc"), 1))
    println(wordsCount(arrayOf("a", "bb", "b", "ccc"), 3))
    println(wordsCount(arrayOf("a", "bb", "b", "ccc"), 4))
}

fun wordsCount(words: Array<String>, len: Int): Int {
    var count = 0
    for (word in words) {
        if (word.length == len) count++
    }
    return count
}