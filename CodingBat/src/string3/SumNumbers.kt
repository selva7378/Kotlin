package string3

/*
 *Given a string, return the sum of the numbers appearing in the string,
 *ignoring all other characters. A number is a series of 1 or more digit
 *chars in a row. (Note: Character.isDigit(char) tests if a char is one of
 *the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 *
 *
 *sumNumbers("abc123xyz") → 123
 *sumNumbers("aa11b33") → 44
 *sumNumbers("7 11") → 18
 */

fun main() {
    println(sumNumbers("abc123xyz"))
    println(sumNumbers("aa11b33"))
    println(sumNumbers("7 11"))
}

fun sumNumbers(str: String): Int {
    var res = 0
    var number = 0
    for (char in str) {
        if (char.isDigit()){
            number = number * 10 + char.digitToInt()
        }else{
            res += number
            number = 0
        }
    }
    return res + number
}