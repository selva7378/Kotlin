package string2

/*
 *Look for patterns like "zip" and "zap" in the string -- length-3,
 *starting with 'z' and ending with 'p'. Return a string where for all
 *such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 *
 *
 *zipZap("zipXzap") → "zpXzp"
 *zipZap("zopzop") → "zpzp"
 *zipZap("zzzopzop") → "zzzpzp"
 */

fun main() {
    println(zipZap("zipXzap"))
    println(zipZap("zopzop"))
    println(zipZap("zzzopzop"))
}

fun zipZap(str: String): String {
    var i = 0
    var res: StringBuilder = StringBuilder()
    while (i < str.length){
        if (i+2 < str.length && str[i] == 'z' && str[i+2] == 'p'){
            res.append("zp")
            i += 3
        }else{
            res.append(str[i])
            i++
        }
    }
    return res.toString()
}