package warmup1

/*
 *Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 *The value of n will be a valid index of a char in the original string
 *(i.e. n will be in the range 0..str.length()-1 inclusive).

 *missingChar("kitten", 1) → "ktten"
 *missingChar("kitten", 0) → "itten"
 *missingChar("kitten", 4) → "kittn"
 */

fun main(args: Array<String>) {
    println(missingChar("kitten", 1))
    println(missingChar("kitten", 0))
    println(missingChar("kitten", 4))
}

fun missingChar(str: String, num: Int): String =
    str.substring(0, num) + str.substring(num+1)