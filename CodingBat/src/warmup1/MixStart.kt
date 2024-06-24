package warmup1

/*
 *Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 *
 *mixStart("mix snacks") → true
 *mixStart("pix snacks") → true
 *mixStart("piz snacks") → false
 */

fun main() {
    println(mixStart("mix snacks"))
    println(mixStart("pix snacks"))
    println(mixStart("piz snacks"))
}

fun mixStart(str: String): Boolean =
    if (str.length < 3) false
    else str.substring(1, 3).equals("ix")
