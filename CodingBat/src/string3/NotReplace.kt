package string3

/*
 *Given a string, return a string where every appearance of the lowercase word "is"
 *has been replaced with "is not". The word "is" should not be immediately preceeded
 *or followed by a letter -- so for example the "is" in "this" does not count.
 *(Note: Character.isLetter(char) tests if a char is a letter.)
 *
 *
 *notReplace("is test") → "is not test"
 *notReplace("is-is") → "is not-is not"
 *notReplace("This is right") → "This is not right"
 */

fun main() {
    println(notReplace("is test"))
    println(notReplace("is-is"))
    println(notReplace("This is right"))
}

fun notReplace(str: String): String {
    var res: StringBuilder = StringBuilder()
    var i = 0
    while (i <= str.length - 1) {
        if (i - 1 >= 0 && str[i - 1].isLetter() || i + 2 <= str.length-1 && str[i + 2].isLetter()){
            res.append(str[i])
        }else if (i + 2 <= str.length && str.substring(i, i+2).equals("is")) {
            res.append("is not")
            i = i + 2
            continue
        }else res.append(str[i])
        i++
    }
    return res.toString()
}