package string2

/*
 *A sandwich is two pieces of bread with something in between. Return the string
 *that is between the first and last appearance of "bread" in the given string, or
 *return the empty string "" if there are not two pieces of bread.
 *
 *
 *getSandwich("breadjambread") → "jam"
 *getSandwich("xxbreadjambreadyy") → "jam"
 *getSandwich("xxbreadyy") → ""
 */

fun main() {
    println(getSandwich("breadjambread"))
    println(getSandwich("xxbreadjambreadyy"))
    println(getSandwich("xxbreadyy"))
}

fun getSandwich(str: String): String {
    var start = -1
    var end = -1

    demo1@ for (i in 0..str.length - 5) {
        if (str.substring(i, i + 5).equals("bread")) {
            start = i
            break@demo1
        }
    }

    demo2@ for (i in str.length downTo 5) {
        if (str.substring(i - 5, i).equals("bread")) {
            end = i - 5
            break@demo2
        }
    }

    if (start != end) {
        return str.substring(start + 5, end)
    }

    return ""
}