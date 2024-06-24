package warmup1
/*
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

 * parrotTrouble(true, 6) → true
 * parrotTrouble(true, 7) → false
 * parrotTrouble(false, 6) → false
 */

fun main(args: Array<String>) {
    println(parrotTrouble(true, 6))
    println(parrotTrouble(true, 7))
    println(parrotTrouble(false, 6))
}

fun parrotTrouble(talking: Boolean, hour: Int): Boolean =
    if (talking && (hour < 7 || hour > 20)) true else false