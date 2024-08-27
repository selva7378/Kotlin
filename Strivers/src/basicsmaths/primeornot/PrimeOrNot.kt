package basicsmaths.primeornot

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    println(primeOrNot(num))
}

fun primeOrNot(number: Int): Boolean {
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}