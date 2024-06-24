package warmup1

/*
 *Given a string, return a new string where "not " has been added to the front.
 *However, if the string already begins with "not", return the string unchanged.
 *Note: use .equals() to compare 2 strings.
 *
 *notString("candy") → "not candy"
 *notString("x") → "not x"
 *notString("not bad") → "not bad"
 */

fun main(args: Array<String>) {
    println(notString("candy"))
    println(notString("x"))
    println(notString("not bad"))
}

fun notString(str: String): String =
    if (str.length < 3) "not " + str
    else if (str.substring(0, 3).equals("not")) str
    else "not " + str

fun anotherSolution(str: String): String =
    if (str.startsWith("not")) str
    else "not $str"
