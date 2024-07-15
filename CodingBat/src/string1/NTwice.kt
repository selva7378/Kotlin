package string1

/*
 *Given a string and an int n, return a string made of the first and last n chars from the string.
 *The string length will be at least n.
 *
 *nTwice("Hello", 2) → "Helo"
 *nTwice("Chocolate", 3) → "Choate"
 *nTwice("Chocolate", 1) → "Ce"
 */

fun main() {
    println(nTwice("Hello", 2))
    println(nTwice("Chocolate", 3))
    println(nTwice("Chocolate", 1))
}

fun nTwice(str: String, num: Int): String = str.substring(0, num) + str.substring(str.length - num)