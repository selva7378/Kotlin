package string1

/*
 *Given two strings, append them together (known as "concatenation") and return the result.
 *However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 *
 *conCat("abc", "cat") → "abcat"
 *conCat("dog", "cat") → "dogcat"
 *conCat("abc", "") → "abc"
 */

fun main() {
    println(conCat("abc", "cat"))
    println(conCat("dog", "cat"))
    println(conCat("abc", ""))
}

fun conCat(a: String, b: String): String =
    if (a.length == 0 || b.length == 0) a + b
    else if (a[a.length - 1] == b[0]) a.substring(0, a.length - 1) + b.substring(1)
    else a + b