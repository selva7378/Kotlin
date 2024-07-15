package string1

/*
 *Given 2 strings, a and b, return a string of the form short+long+short,
 *with the shorter string on the outside and the longer string on the inside.
 *The strings will not be the same length, but they may be empty (length 0).
 *
 *comboString("Hello", "hi") → "hiHellohi"
 *comboString("hi", "Hello") → "hiHellohi"
 *comboString("aaa", "b") → "baaab"
 */

fun main() {
    println(comboString("Hello", "hi"))
    println(comboString("hi", "Hello"))
    println(comboString("aaa", "b"))
}

fun comboString(str1: String, str2: String): String =
    if (str1.length < str2.length)
        str1 + str2 + str1
    else
        str2 + str1 + str2

