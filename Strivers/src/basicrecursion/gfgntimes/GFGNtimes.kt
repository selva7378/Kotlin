package basicrecursion.gfgntimes

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    GFGNtimes(num)
}

fun GFGNtimes(n: Int) {
    if (n == 0) return
    print("GFG ")
    GFGNtimes(n - 1)
}