package warmup2

/*
 *Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
 *So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
 *
 *stringMatch("xxcaazz", "xxbaaz") → 3
 *stringMatch("abc", "abc") → 2
 *stringMatch("abc", "axc") → 0
 */

fun main() {
    println(stringMatch("xxcaazz", "xxbaaz"))
    println(stringMatch("abc", "abc"))
    println(stringMatch("abc", "axc"))
}

fun stringMatch(a: String, b: String): Int {
    var res = 0
    var lessLengthString = minOf(a.length, b.length)
    for (i in 0..lessLengthString-2) {
        if (a.substring(i, i+2).equals(b.substring(i, i+2))) res++
    }
    return res
}