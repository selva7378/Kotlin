package string2

/*
 *Return true if the string "cat" and "dog" appear the same number of times in the given string.
 *
 *
 *catDog("catdog") → true
 *catDog("catcat") → false
 *catDog("1cat1cadodog") → true
 */

fun main() {
    println(catDog("catdog"))
    println(catDog("catcat"))
    println(catDog("1cat1cadodog"))
}

fun catDog(str: String): Boolean {
    var catCount = 0
    var dogCount = 0
    for (i in 0..str.length-3) {
        if (str.substring(i, i+ 3).equals("cat")) catCount++
        if (str.substring(i, i+ 3).equals("dog")) dogCount++
    }
    return catCount == dogCount
}