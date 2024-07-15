package string2

/*
 *Given two strings, word and a separator sep, return a big string made of count
 *occurrences of the word, separated by the separator string.
 *
 *
 *repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 *repeatSeparator("This", "And", 2) → "ThisAndThis"
 *repeatSeparator("This", "And", 1) → "This"
 */

fun main() {
    println(repeatSeparator("Word", "X", 3))
    println(repeatSeparator("This", "And", 2))
    println(repeatSeparator("This", "And", 1))
}

fun repeatSeparator(word: String, sep: String, count: Int): String {
    var res: StringBuilder = StringBuilder()
    for (i in 1..count){
        if (i != count){
            res.append(word).append(sep)
        }else {
            res.append(word)
        }
    }
    return res.toString()
}