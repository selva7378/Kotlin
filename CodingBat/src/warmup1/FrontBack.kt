package warmup1

/*
 *Given a string, return a new string where the first and last chars have been exchanged.
 *
 *frontBack("code") → "eodc"
 *frontBack("a") → "a"
 *frontBack("ab") → "ba"
 */

fun main(args: Array<String>) {
    frontBack("code")
    frontBack("a")
    frontBack("ab")
}

fun frontBack(str: String) {
    println(str.swap(str, 0, str.length-1))
}

fun String.swap(str: String, i: Int, j: Int): String {
    val locStr: StringBuilder = StringBuilder(str)
    val temp: Char = locStr[0]
    locStr[0] = locStr[locStr.length-1]
    locStr[locStr.length-1] = temp
    return locStr.toString()
}
