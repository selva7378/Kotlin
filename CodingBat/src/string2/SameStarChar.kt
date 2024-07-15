package string2

/*
 *Returns true if for every '*' (star) in the string, if there are chars both immediately before
 *and after the star, they are the same.
 *
 *
 *sameStarChar("xy*yzz") → true
 *sameStarChar("xy*zzz") → false
 *sameStarChar("*xa*az") → true
 */

fun main() {
    println(sameStarChar("xy*yzz"))
    println(sameStarChar("xy*zzz"))
    println(sameStarChar("*xa*az"))
}

fun sameStarChar(str: String): Boolean {
    for (i in 1..str.length-2){
        if (str[i] == '*' && (str[i-1] != str[i+1])) return false
    }
    return true
}