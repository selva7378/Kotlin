package recursion


fun main() {
    println(sumNaturalNumber(2))
    println(sumNaturalNumber(4))
    println(sumNaturalNumber(5))
}

fun sumNaturalNumber(n: Int): Int {
    if (n < 1) {
        println("Not a valid number")
        return -1
    } else if (n == 1) {
        return 1
    } else {
        return n + sumNaturalNumber(n-1)
    }
}