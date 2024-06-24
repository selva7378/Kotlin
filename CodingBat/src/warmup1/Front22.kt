package warmup1

/*
 *Given a string, take the first 2 chars and return the string with the 2
 *chars added at both the front and back, so "kitten" yields"kikittenki".
 *If the string length is less than 2, use whatever chars are there.
 *
 *front22("kitten") → "kikittenki"
 *front22("Ha") → "HaHaHa"
 *front22("abc") → "ababcab"
 */

fun main() {
    println(front22("kitten"))
    println(front22("Ha"))
    println(front22("abc"))
}

fun front22(str: String): String =
    if (str.length < 2) str + str + str
    else str.substring(0,2) + str + str.substring(0,2)