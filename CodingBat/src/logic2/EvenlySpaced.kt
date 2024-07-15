package logic2

/*
 *Given three ints, a b c, one of them is small, one is medium and one is large.
 *Return true if the three values are evenly spaced, so the difference between
 *small and medium is the same as the difference between medium and large.
 *
 *
 *evenlySpaced(2, 4, 6) → true
 *evenlySpaced(4, 6, 2) → true
 *evenlySpaced(4, 6, 3) → false
 */

fun main() {
    println(evenlySpaced(2, 4, 6))
    println(evenlySpaced(4, 6, 2))
    println(evenlySpaced(4, 6, 3))
}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
    var a = a
    var b = b
    var c = c
    var temp: Int

    if (a > b){
        temp = a
        a = b
        b = temp
    }

    if (b > c){
        temp = b
        b = c
        c = temp
    }

    if (a > b){
        temp = a
        a = b
        b = temp
    }

    return a - b == b - c

}

