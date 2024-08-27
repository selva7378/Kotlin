package basicrecursion.sumofseries

fun main(args: Array<String>) {
    for (i in 1..5) {
        val num = (1..5).random().toLong()
        print("$num = ")
        println(sumOfSeries(num))
    }
}

fun sumOfSeries(num: Long): Long {
    if (num <= 0) return 0
    return Math.pow(num.toDouble(), 3.0).toLong() + sumOfSeries(num - 1)
}