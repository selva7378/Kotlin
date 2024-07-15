package logic1

/*
 *Your cell phone rings. Return true if you should answer it.
 *Normally you answer, except in the morning you only answer if
 *it is your mom calling. In all cases, if you are asleep, you do not answer.
 *
 *answerCell(false, false, false) → true
 *answerCell(false, false, true) → false
 *answerCell(true, false, false) → false
 */

fun main() {
    println(answerCell(false, false, false))
    println(answerCell(false, false, true))
    println(answerCell(true, false, false))
}

fun answerCell(isMorning: Boolean, isMom: Boolean, isAsleep: Boolean): Boolean {
    if (isAsleep) return false
    if ((isMorning && isMom) || !isMorning) return true
    return false
}