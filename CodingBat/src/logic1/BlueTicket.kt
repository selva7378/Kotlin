package logic1

/*
 *You have a blue lottery ticket, with ints a, b, and c on it.
 *This makes three pairs, which we'll call ab, bc, and ac.
 *Consider the sum of the numbers in each pair. If any pair
 *sums to exactly 10, the result is 10. Otherwise if the ab sum
 *is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
 *
 *
 *blueTicket(9, 1, 0) → 10
 *blueTicket(9, 2, 0) → 0
 *blueTicket(6, 1, 4) → 10
 */

fun main() {
    println(blueTicket(9,1 , 0))
    println(blueTicket(9,2 , 0))
    println(blueTicket(6,1 , 4))
}

fun blueTicket(a: Int, b: Int, c: Int): Int {
    val ab = a + b
    val bc = b + c
    val ac = a + c

    if (ab == 10 || bc == 10 || ac == 10) return 10
    if (ab - bc == 10 || ab - ac == 10) return 5
    return 0
}