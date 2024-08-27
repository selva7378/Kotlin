package basicrecursion.factorialofnnumbers

val res = ArrayList<Long>()
val origNum = 6L

fun main(args: Array<String>) {
    factorialOfNNumbers(origNum)
    println(res)
}

fun factorialOfNNumbers(n: Long): Long {
    if (n <= 0) return 1
    val fact = n * factorialOfNNumbers(n-1)
    if (fact <= origNum) {
        res.add(fact)
    }
    return fact
}