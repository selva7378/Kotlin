package string2

/*
 *Given two strings, return true if either of the strings appears at the very end
 *of the other string, ignoring upper/lower case differences (in other words, the
 *computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
 *
 *
 *endOther("Hiabc", "abc") → true
 *endOther("AbC", "HiaBc") → true
 *endOther("abc", "abXabc") → true
 */

fun main() {

}

fun endOther(a: String, b: String): Boolean {
    val a = a.lowercase()
    val b = b.lowercase()

    if (a.length > b.length){
        return a.substring(a.length - b.length).equals(b)
    }

    if (a.length < b.length){
        return b.substring(b.length - a.length).equals(a)
    }

    return a.equals(b)
}