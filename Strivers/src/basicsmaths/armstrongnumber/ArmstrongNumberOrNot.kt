package basicsmaths.armstrongnumber

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    println(armstrongNumberOrNot(number))
}

fun armstrongNumberOrNot(number: Int): Boolean {
    var numberDup = number
    val numberOfDigits = (Math.log10(numberDup.toDouble()) + 1).toInt()
    var total = 0.0
    while (numberDup != 0) {
        val lastDigit = numberDup % 10
        numberDup /= 10
        total += Math.pow(lastDigit.toDouble(), numberOfDigits.toDouble())
    }
    return number == total.toInt()
}