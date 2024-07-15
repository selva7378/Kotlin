package string1

/*
 *Given a string, if the first or last chars are 'x',
 *return the string without those 'x' chars, and otherwise return the string unchanged.
 *
 *withoutX("xHix") → "Hi"
 *withoutX("xHi") → "Hi"
 *withoutX("Hxix") → "Hxi"
 */

fun main() {
    println(withoutX("xHix"))
    println(withoutX("xHi"))
    println(withoutX("Hxix"))
}

fun withoutX(str: String): String {
    var res: StringBuilder = StringBuilder()
    for (char in str.withIndex()) {
        if (char.value == 'x' && (char.index == 0 || char.index == str.length-1)) continue
        res.append(char.value)
    }
    return res.toString()
}