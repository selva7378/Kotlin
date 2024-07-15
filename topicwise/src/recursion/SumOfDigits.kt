package recursion

// sum of digits using recursion

fun main() {
    println(sumOfDigits(253))
    println(sumOfDigits(9987))
    println(sumOfDigits(10))
}

fun sumOfDigits(n: Int): Int {
    if (n == 0) return 0
    else {
        return n % 10 + sumOfDigits(n / 10)
    }
}