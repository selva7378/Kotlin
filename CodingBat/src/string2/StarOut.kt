package string2

/*
 *Return a version of the given string, where for every star (*)
 *in the string the star and the chars immediately to its left and
 *right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 *
 *
 *starOut("ab*cd") → "ad"
 *starOut("ab**cd") → "ad"
 *starOut("sm*eilly") → "silly"
 */

fun main() {
    println(starOut("ab*cd"))
    println(starOut("ab**cd"))
    println(starOut("sm*eilly"))
}

fun starOut(str: String): String {
    var res: StringBuilder = StringBuilder()
    for (char in str.withIndex()) {
        if (char.index == 0 && char.value != '*') {
            res.append(char.value)
        }

        if (char.index > 0 && char.value != '*' && str[char.index - 1] != '*') {
            res.append(char.value)
        }

        if (char.index > 0 && char.value == '*' && str[char.index - 1] != '*') {
            if (res.isNotEmpty())
                res = res.deleteCharAt(res.length-1)
        }
    }
    return res.toString()
}