package string1

/*
 *Given a string, if one or both of the first 2 chars is 'x',
 *return the string without those 'x' chars, and otherwise return the string unchanged.
 *This is a little harder than it looks.
 *
 *withoutX2("xHi") → "Hi"
 *withoutX2("Hxi") → "Hi"
 *withoutX2("Hi") → "Hi"
 */

fun main() {
    println(withoutX2("xHi"))
    println(withoutX2("Hxi"))
    println(withoutX2("Hi"))
}

fun withoutX2(str: String): String {
    var res: StringBuilder = StringBuilder()
    for (char in str.withIndex()) {
        if (char.value == 'x' && (char.index == 1 || char.index == 0)) continue
        res.append(char.value)
    }
    return res.toString()
}