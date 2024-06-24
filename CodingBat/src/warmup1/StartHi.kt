package warmup1

/*
 *Given a string, return true if the string starts with "hi" and false otherwise.
 *
 *startHi("hi there") → true
 *startHi("hi") → true
 *startHi("hello hi") → false
 */

fun main() {
    println(startHi("hi there"))
    println(startHi("hi"))
    println(startHi("hello hi"))
}

fun startHi(str: String): Boolean =
    if (str.length < 2) false
    else str.substring(0, 2).equals("hi")