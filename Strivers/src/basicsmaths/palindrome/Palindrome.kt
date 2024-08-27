package basicsmaths.palindrome

import basicsmaths.reversenumber.reverse
import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    println(isPalindrome(number))
}

fun isPalindrome(number: Int): Boolean {
    val reveseNumber = reverse(number)
    return number == reveseNumber
}