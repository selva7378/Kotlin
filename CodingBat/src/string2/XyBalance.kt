package string2

/*
 *We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 *there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
 *but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
 *
 *
 *xyBalance("aaxbby") → true
 *xyBalance("aaxbb") → false
 *xyBalance("yaaxbb") → false
 */

fun main() {
    println(xyBalance("aaxbby"))
    println(xyBalance("aaxbb"))
    println(xyBalance("yaaxbb"))
}

fun xyBalance(str: String): Boolean {
    for (char in str.reversed()) {
        if (char == 'y') return true
        if (char == 'x') return false
    }
    return true
}