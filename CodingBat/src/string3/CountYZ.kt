package string3

/*
 *Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
 *and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll
 *say that a y or z is at the end of a word if there is not an alphabetic letter immediately
 *following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 *
 *
 *countYZ("fez day") → 2
 *countYZ("day fez") → 2
 *countYZ("day fyyyz") → 2
 */

fun main() {
    println(countYZ("fez day"))
    println(countYZ("day fez"))
    println(countYZ("day fyyyz"))
}

fun countYZ(str: String): Int {
    var count = 0
    for (char in str.withIndex()) {
        if (char.value == 'z' || char.value == 'y') {
            if (char.index < str.length - 1 && !str[char.index + 1].isLetter()) {
                count++
            } else if (char.index == str.length - 1) {
                count++
            }
        }
    }
    return count
}