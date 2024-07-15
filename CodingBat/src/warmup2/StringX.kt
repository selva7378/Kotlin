package warmup2

/*
 *Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 *
 *stringX("xxHxix") → "xHix"
 *stringX("abxxxcd") → "abcd"
 *stringX("xabxxxcdx") → "xabcdx"
 * stringX("x") → "x"
 * stringX("") → ""
 */

fun main() {
    println(stringX("xxHxix"))
    println(stringX("abxxxcd"))
    println(stringX("xabxxxcdx"))
    println(stringX("x"))
    println(stringX(""))
}

fun stringX(str: String): String {
    val res: StringBuilder = StringBuilder()
    if (str.length <= 2) return str
    else {
        for (i in 1..str.length - 2) {
            if (str[i] != 'x') res.append(str[i])
        }
    }
    return str[0] + res.toString() + str[str.length-1]
}