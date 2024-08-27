package basicsmaths.reversenumber

fun main(args: Array<String>) {
    println(reverse(1056389759))
}

fun reverse(x: Int): Int {
    var originalNumber = x
    var res: Long = 0L
    while(originalNumber != 0) {
        val lastDigit = originalNumber % 10
        res = res * 10 + lastDigit
        originalNumber /= 10
    }

    if(res >= Math.pow(-2.0, 31.0) &&
        res <= Math.pow(2.0, 31.0)){
        return res.toInt()
    }
    return 0
}