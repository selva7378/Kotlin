package string2

/*
 *Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 *
 *
 *bobThere("abcbob") → true
 *bobThere("b9b") → true
 *bobThere("bac") → false
 */

fun main() {
    println(bobThere("abcbob"))
    println(bobThere("b9b"))
    println(bobThere("bac"))
}

fun bobThere(str: String): Boolean {
    for (i in 0..str.length-3) {
        if (str[i] == 'b' && str[i+2] == 'b') return true
    }
    return false
}