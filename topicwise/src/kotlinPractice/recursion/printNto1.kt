package kotlinPractice.recursion

// print n..1 using kotlin.recursion.

fun main() {
    printNto1(5)
    println()
    printNto1(0)

}

fun printNto1(n: Int) {
    if (n <= 1) print("$n ")
    else {
        print("$n ")
        printNto1(n-1)
    }
}