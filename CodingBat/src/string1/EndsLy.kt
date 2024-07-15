package string1

/*
 *Given a string, return true if it ends in "ly".
 *
 *endsLy("oddly") → true
 *endsLy("y") → false
 *endsLy("oddy") → false
 */

fun main() {
    println(endsLy("oddly"))
    println(endsLy("y"))
    println(endsLy("oddy"))
}

fun endsLy(str: String): Boolean =
    if (str.length < 2) false
    else if (str.substring(str.length - 2).equals("ly")) true
    else false