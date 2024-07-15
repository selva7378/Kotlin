package string2

/*
 *Given a string, compute a new string by moving the first char to come after
 *the next two chars, so "abc" yields "bca". Repeat this process for each subsequent
 *group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 *
 *
 *oneTwo("abc") → "bca"
 *oneTwo("tca") → "cat"
 *oneTwo("tcagdo") → "catdog"
 */

fun main(){
    println(oneTwo("abc"))
    println(oneTwo("tca"))
    println(oneTwo("tcagdo"))
}

fun oneTwo(str: String): String {
    var res: StringBuilder = StringBuilder()
    for (i in 0..str.length-3 step 3) {
        res.append(str.substring(i+1, i+3)).append(str[i])
    }
    return res.toString()
}