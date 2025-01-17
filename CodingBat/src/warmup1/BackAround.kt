package warmup1

/*
 *Given a string, take the last char and return a new string with the last char added at the front and back,
 *so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 *backAround("cat") → "tcatt"
 *backAround("Hello") → "oHelloo"
 *backAround("a") → "aaa"
 */

fun main(args: Array<String>) {
    println(backAround("cat"))
    println(backAround("Hello"))
    println(backAround("a"))
}

fun backAround(str: String): String =
    str.last() + str + str.last()