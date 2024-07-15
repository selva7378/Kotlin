package warmup2

/*
 *Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 *doubleX("axxbb") → true
 *doubleX("axaxax") → false
 *doubleX("xxxxx") → true
 */

fun main() {
    println(doubleX("axxbb"))
    println(doubleX("axaxax"))
    println(doubleX("xxxxx"))
}

fun doubleX(str: String): Boolean {
    for(i in 0 until str.length-1) {
        if (str[i].equals('x')) {
            if (str[i+1].equals('x')) return true
            else return false
        }
    }
    return false
}