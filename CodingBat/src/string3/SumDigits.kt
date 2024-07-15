package string3

/*
 *Given a string, return the sum of the digits 0-9 that appear in the string,
 *ignoring all other characters. Return 0 if there are no digits in the string.
 *(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1',
 *.. '9'. Integer.parseInt(string) converts a string to an int.)
 *
 *
 *sumDigits("aa1bc2d3") → 6
 *sumDigits("aa11b33") → 8
 *sumDigits("Chocolate") → 0
 */

fun main() {
    println(sumDigits("aa1bc2d3"))
    println(sumDigits("aa11b33"))
    println(sumDigits("Chocolate"))
}

fun sumDigits(str: String): Int {
    var res = 0
    for (char in str) {
        if (char.isDigit()){
            res += char.digitToInt()
        }
    }
    return res
}