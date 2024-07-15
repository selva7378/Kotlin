package warmup2

/*
 *Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *countXX("abcxx") → 1
 *countXX("xxx") → 2
 *countXX("xxxx") → 3
 */

fun main() {
    println(countXX("abcxx"))
    println(countXX("xxx"))
    println(countXX("xxxx"))
}

fun countXX(str: String): Int {
    var xxCount: Int = 0
    for (i in 0 until str.length-1) {
        if (str.substring(i, i+2).equals("xx")) xxCount++
    }
    return xxCount
}
