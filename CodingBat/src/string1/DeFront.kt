package string1

/*
 *Given a string, return a version without the first 2 chars.
 *Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 *The string may be any length. Harder than it looks.
 *
 *deFront("Hello") → "llo"
 *deFront("java") → "va"
 *deFront("away") → "aay"
 */

fun main() {
    println(deFront("Hello"))
    println(deFront("java"))
    println(deFront("away"))
}

fun deFront(str: String): String {
    var res: StringBuilder = StringBuilder()
    for (char in str.withIndex()) {
        if (char.value == 'a' && char.index == 0 ) res.append('a')
        else if (char.value == 'b' && char.index == 1) res.append('b')
        else if (char.index > 1) {
            res.append(char.value)
        }
    }
    return res.toString()
}