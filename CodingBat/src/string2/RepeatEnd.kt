package string2

/*
 *Given a string and an int n, return a string made of n repetitions of the
 *last n characters of the string. You may assume that n is between 0 and the
 *length of the string, inclusive.
 *
 *
 *repeatEnd("Hello", 3) → "llollollo"
 *repeatEnd("Hello", 2) → "lolo"
 *repeatEnd("Hello", 1) → "o"
 */

fun main() {
    println(repeatEnd("Hello", 3))
    println(repeatEnd("Hello", 2))
    println(repeatEnd("Hello", 1))
}

fun repeatEnd(str: String, n: Int): String {
    var res: StringBuilder = StringBuilder()
    repeat(n) {
        res.append(str.substring(str.length - n))
    }
    return res.toString()
}