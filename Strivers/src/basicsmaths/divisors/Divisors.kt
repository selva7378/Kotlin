package basicsmaths.divisors

import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    println(divisorsOfNumber(number).sorted())
}

private fun divisorsOfNumber(number: Int): List<Int> {
    val arrList = mutableListOf<Int>()
    var i = 1
    while (i <= sqrt(number.toDouble())) {
        if (number % i == 0) {
            arrList.add(i)
            if (i != number / i) {
                arrList.add(number / i)
            }
        }
        i++
    }
    arrList.sorted()
    return arrList
}