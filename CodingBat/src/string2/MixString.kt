package string2

/*
 *Given two strings, a and b, create a bigger string made of the first char of a,
 *the first char of b, the second char of a, the second char of b, and so on.
 *Any leftover chars go at the end of the result.
 *
 *
 *mixString("abc", "xyz") → "axbycz"
 *mixString("Hi", "There") → "HTihere"
 *mixString("xxxx", "There") → "xTxhxexre"
 */

fun main() {
    println(mixString("abc", "xyz"))
    println(mixString("Hi", "There"))
    println(mixString("xxxx", "There"))
}

fun mixString(a: String, b: String): String {
    var res: StringBuilder = StringBuilder()
    val loopLen = if (a.length > b.length) a.length else b.length
    for (i in 0..loopLen-1) {
        if (i < a.length) res.append(a[i])
        if (i < b.length) res.append(b[i])
    }
    return res.toString()
}