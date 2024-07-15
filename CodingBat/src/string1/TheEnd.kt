package string1

/*
 *Given a string, return a string length 1 from its front, unless front is false,
 *in which case return a string length 1 from its back. The string will be non-empty.
 *
 *theEnd("Hello", true) → "H"
 *theEnd("Hello", false) → "o"
 *theEnd("oh", true) → "o"
 */

fun main() {
    println(theEnd("Hello", true))
    println(theEnd("Hello", false))
    println(theEnd("oh", true))
}

fun theEnd(str: String, front: Boolean): Char =
    if (front) str[0]
    else str[str.length - 1]