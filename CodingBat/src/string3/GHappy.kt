package string3

/*
 *We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
 *immediately to its left or right. Return true if all the g's in the given string are happy.
 *
 *
 *gHappy("xxggxx") → true
 *gHappy("xxgxx") → false
 *gHappy("xxggyygxx") → false
 *gHappy("xxgggxyg") → false
 */

fun main() {
    println(gHappy("xxggxx"))
    println(gHappy("xxgxx"))
    println(gHappy("xxggyygxx"))
    println(gHappy("xxgggxyg"))
}

fun gHappy(str: String): Boolean {
    if (str.length == 1) return false
    var res = true
    for (i in 0..str.length-1) {
        if (i - 1 >= 0 && str[i] == 'g' && str[i-1] != 'g') res = false
        else continue

        if (i+1 < str.length && str[i] == 'g' && str[i + 1] != 'g') {
            return false
        } else if (i+1 < str.length && str[i + 1] == 'g') {
            res = true
        }
    }
    return res
}