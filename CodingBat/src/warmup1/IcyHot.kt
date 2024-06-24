package warmup1

/*
 *Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 *
 *icyHot(120, -1) → true
 *icyHot(-1, 120) → true
 *icyHot(2, 120) → false
 */
fun main() {
    println(icyHot(120, -1))
    println(icyHot(-1, 120))
    println(icyHot(2, 120))
}

fun icyHot(temp1: Int, temp2: Int): Boolean = (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)