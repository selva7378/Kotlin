package string3

/*
 *Given a string, look for a mirror image (backwards) string at both the
 *beginning and end of the given string. In other words, zero or more
 *characters at the very begining of the given string, and at the very
 *end of the string in reverse order (possibly overlapping). For example,
 *the string "abXYZba" has the mirror end "ab".
 *
 *
 *mirrorEnds("abXYZba") → "ab"
 *mirrorEnds("abca") → "a"
 *mirrorEnds("aba") → "aba"
 */

fun main() {
    println(mirrorEnds("abXYZba"))
    println(mirrorEnds("abca"))
    println(mirrorEnds("aba"))
}

fun mirrorEnds(str: String): String {
    var res: StringBuilder = StringBuilder()
    var i = 0
    var j = str.length-1
    labelDemo@while (i <= j) {
        if (str[i] == str[j]){
            res.append(str[i])
            if (i == j){
                res.clear()
                res.append(str)
            }
        }else{
            break@labelDemo
        }
        i++
        j--
    }
    return res.toString()
}