package basicrecursion.nto1

import java.util.Scanner

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Enter the number : ")
    val number = sc.nextInt()
    printNto1(number)
}

fun printNto1(n: Int): Unit {
    if (n <= 0) return
    else {
        printNto1(n-1)
        print("$n ")
    }
}