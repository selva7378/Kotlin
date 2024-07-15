package warmup2

/*
 *Given a string, return the count of the number of times that a substring
 *length 2 appears in the string and also as the last 2 chars of the string,
 *so "hixxxhi" yields 1 (we won't count the end substring).
 *
 *last2("hixxhi") → 1
 *last2("xaxxaxaxx") → 1
 *last2("axxxaaxx") → 2
 */

fun main() {
    println(last2("hixxhi"))
    println(last2("xaxxaxaxx"))
    println(last2("axxxaaxx"))
}

fun last2(str: String): Int {
    if (str.length < 4) return 0
    else {
        var count: Int = 0
        var subString: String = str.substring(str.length-2)
        for (i in 0..str.length-3) {
            if(subString.equals(str.substring(i,i+2))) count++
        }
        return count
    }
}