package warmup1

/*
 *Given a non-empty string and an int N, return the string made starting with char 0,
 *and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 *everyNth("Miracle", 2) → "Mrce"
 *everyNth("abcdefg", 2) → "aceg"
 *everyNth("abcdefg", 3) → "adg"
 */

fun main() {
    println(everyNth("Miracle", 2))
    println(everyNth("abcdefg", 2))
    println(everyNth("abcdefg", 3))
}

fun everyNth(str: String, n: Int): String {
    var res: StringBuilder = StringBuilder("")
    for (i in 0 until str.length step n) {
        res.append(str[i])
    }
    return res.toString()
}