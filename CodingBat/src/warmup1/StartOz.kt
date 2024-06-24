package warmup1

/*
 *Given a string, return a string made of the first 2 chars (if present),
 *however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 *
 *startOz("ozymandias") → "oz"
 *startOz("bzoo") → "z"
 *startOz("oxx") → "o"
 */

fun main() {
    println(startOz("ozymandias"))
    println(startOz("bzoo"))
    println(startOz("oxx"))
}

fun startOz(str: String): String =
    if (str.length < 2) ""
    else {
        var rtStr: String = ""
        if (str[0] == 'o') rtStr += str[0]
        if (str[1] == 'z') rtStr += str[1]
        rtStr
    }