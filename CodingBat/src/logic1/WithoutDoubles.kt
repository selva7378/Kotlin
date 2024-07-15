package logic1

/*
 *Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
 *if noDoubles is true, if the two dice show the same value, increment one
 *die to the next value, wrapping around to 1 if its value was 6.
 *
 *
 *withoutDoubles(2, 3, true) → 5
 *withoutDoubles(3, 3, true) → 7
 *withoutDoubles(3, 3, false) → 6
 */

fun main() {
    println(withoutDoubles(2, 3, true))
    println(withoutDoubles(3, 3, true))
    println(withoutDoubles(3, 3, false))
}

fun withoutDoubles(die1: Int, die2: Int, noDoubles: Boolean): Int {
    if (noDoubles && die1 == die2){
        if (die1 + 1 > 6){
            return 1 + die2
        }else{
            return die1 + die2 + 1
        }
    }
    return die1 + die2
}