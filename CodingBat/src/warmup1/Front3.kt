package warmup1


/*
 *Given a string, we'll say that the front is the first 3 chars of the string.
 *If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 *
 *front3("Java") → "JavJavJav"
 *front3("Chocolate") → "ChoChoCho"
 *front3("abc") → "abcabcabc"
 */

fun main(args: Array<String>) {
    println(front3("Java"))
    println(front3("Chocolate"))
    println(front3("abc"))
}

fun front3(str: String): String =
    if (str.length < 3) str + str + str
    else {
        val subString: String = str.substring(0, 3)
        subString + subString + subString
    }
