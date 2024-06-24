package warmup2

/*
 *Given a string and a non-negative int n, return a larger string that is n copies of the original string.

 *stringTimes("Hi", 2) → "HiHi"
 *stringTimes("Hi", 3) → "HiHiHi"
 *stringTimes("Hi", 1) → "Hi"
 */

fun main() {
    println(stringTimes("Hi", 2))
    println(stringTimes("Hi", 3))
    println(stringTimes("Hi", 1))
}

fun stringTimes(str: String, num: Int): String {
    val mStr: StringBuilder = StringBuilder()
    repeat(num) {
        mStr.append(str)
    }
    return mStr.toString()
}