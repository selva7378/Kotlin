package warmup1

/*
 *The parameter weekday is true if it is a weekday, and the parameter
 *vacation is true if we are on vacation. We sleep in if it is not
 *a weekday or we're on vacation. Return true if we sleep in.

 *sleepIn(false, false) → true
 *sleepIn(true, false) → false
 *sleepIn(false, true) → true
 */

fun main(args: Array<String>) {
    println(sleepIn(false, false))
    println(sleepIn(true, false))
    println(sleepIn(false, true))
}

fun sleepIn(weekday: Boolean, vacation: Boolean): Boolean =
    if(!weekday || vacation) true else false
