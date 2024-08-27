package basicsmaths.lcmandgcd

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a: Long = sc.nextLong()
    val b: Long = sc.nextLong()
    println(lcmAndGcd(a ,b).contentToString())
}

fun lcmAndGcd(a: Long, b: Long): Array<Long> {
    val gcd = gcd(a, b)
    val lcm = a * b / gcd
    return arrayOf(lcm, gcd)
}

fun gcd(a: Long, b: Long): Long {
    var a1 = a
    var b1 = b
    while(a1 != b1) {
        if (a1 > b1) a1 -= b1 else b1 -= a1
    }
    return a1
}