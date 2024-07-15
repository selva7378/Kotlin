package string2

/*
 *Return true if the given string contains an appearance of "xyz"
 *where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 *
 *
 *xyzThere("abcxyz") → true
 *xyzThere("abc.xyz") → false
 *xyzThere("xyz.abc") → true
 */

fun main() {
    println(xyzThere("abcxyz"))
    println(xyzThere("abc.xyz"))
    println(xyzThere("xyz.abc"))
}

fun xyzThere(str: String): Boolean {
    for (i in 0..str.length-3){
        if (i > 0 && str.substring(i, i+3).equals("xyz") && str[i-1] != '.') return true
        if (i == 0 && str.substring(i, i+3).equals("xyz")) return true
    }
    return false
}