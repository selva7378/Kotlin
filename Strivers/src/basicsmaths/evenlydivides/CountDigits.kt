package basicsmaths.evenlydivides

import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val number: Int = sc.nextInt()
    println(countDigits(number))
}

fun countDigits(number: Int): Int {
    var dup = number
    var count = 0
    demoLabel@ while (dup != 0) {
        val lastDigit = dup % 10
        if (lastDigit == 0){
            dup = dup / 10
            continue@demoLabel
        }
        if (number % lastDigit == 0 ) count++
        dup = dup / 10
    }
    return count
}