package string1

/*
 Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

 nonStart("Hello", "There") → "ellohere"
 nonStart("java", "code") → "avaode"
 nonStart("shotl", "java") → "hotlava"
 */


fun main() {
    println(nonStart("Hello", "There"))
    println(nonStart("java", "code"))
    println(nonStart("shotl", "java"))
}

fun nonStart(a: String, b: String): String = a.substring(1) + b.substring(1)