package basicrecursion.oneton

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Enter the number : ")
    val num = sc.nextInt()
    print1ton(num)
}

fun print1ton(n: Int) {
    if (n <= 0) return
    print1ton(n - 1)
    print("$n ")
}