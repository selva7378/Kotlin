package string3

/*
 *We'll say that a "triple" in a string is a char appearing three times in a row.
 *Return the number of triples in the given string. The triples may overlap.
 *
 *
 *countTriple("abcXXXabc") → 1
 *countTriple("xxxabyyyycd") → 3
 *countTriple("a") → 0
 */

fun main(){
    println(countTriple("abcXXXabc"))
    println(countTriple("xxxabyyyycd"))
    println(countTriple("a"))
}

fun countTriple(str: String): Int {
    var tripleCount = 0
    for (char in 0..str.length-3){
        if (str[char] == str[char+1] && str[char] == str[char+2]) tripleCount++
    }
    return tripleCount
}