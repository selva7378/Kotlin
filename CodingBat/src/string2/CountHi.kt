package string2

/*
 *Return the number of times that the string "hi" appears anywhere in the given string.
 *
 *
 *countHi("abc hi ho") → 1
 *countHi("ABChi hi") → 2
 *countHi("hihi") → 2
 */

fun main() {
    println(countHi("abc hi ho"))
    println(countHi("ABChi hi"))
    println(countHi("hihi"))
}

fun countHi(str: String): Int {
    var hasHi = 0
    for (i in 0..str.length-2) {
        if (str.substring(i, i + 2).equals("hi")) hasHi++
    }
    return hasHi
}