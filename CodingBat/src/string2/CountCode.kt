package string2

/*
 *Return the number of times that the string "code" appears anywhere in the given string,
 *except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 *
 *
 *countCode("aaacodebbb") → 1
 *countCode("codexxcode") → 2
 *countCode("cozexxcope") → 2
 */

fun main() {
    println(countCode("aaacodebbb"))
    println(countCode("codexxcode"))
    println(countCode("cozexxcope"))
}

fun countCode(str: String): Int {
    var co_eCount = 0
    for (i in 0..str.length-4) {
        if (str.substring(i, i+2).equals("co") && str[i+3] == 'e') co_eCount++
    }
    return co_eCount
}