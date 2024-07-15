package recursion

import java.util.InputMismatchException
import java.util.Scanner

// print 1..n using recursion

fun main() {
    val sc = Scanner(System.`in`)
    try {
        val n = sc.nextInt()
        print1toN(n)
        println()
        print1toN(1)
    }catch (e: InputMismatchException) {
        println(e)
    }
}

fun print1toN(n: Int) {
    if (n <= 1) print("$n ")
    else {
        print1toN(n-1)
        print("$n ")
    }
}