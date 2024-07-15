package string3

/*
 *Given two strings, base and remove, return a version of the base string where all
 *instances of the remove string have been removed (not case sensitive). You may
 *assume that the remove string is length 1 or more. Remove only non-overlapping
 *instances, so with "xxx" removing "xx" leaves "x".
 *
 *
 *withoutString("Hello there", "llo") → "He there"
 *withoutString("Hello there", "e") → "Hllo thr"
 *withoutString("Hello there", "x") → "Hello there"
 */

fun main() {
    println(withoutString("Hello there", "llo"))
    println(withoutString("Hello there", "e"))
    println(withoutString("Hello there", "x"))
}

fun withoutString(base: String, remove: String): String {
    var baseDup = base.lowercase()
    var removeDup = remove.lowercase()
    val res: StringBuilder = StringBuilder()
    var i = 0
    while (i < baseDup.length) {
        if ( i+ removeDup.length <= baseDup.length && baseDup.substring(i, i+ removeDup.length).equals(removeDup)){
            i = i + removeDup.length
            continue
        }
        res.append(base[i])
        i++
    }
    return res.toString()
}