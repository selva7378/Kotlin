package warmup2

/*
 *Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 *or whatever is there if the string is less than length 3. Return n copies of the front;
 *
 *frontTimes("Chocolate", 2) → "ChoCho"
 *frontTimes("Chocolate", 3) → "ChoChoCho"
 *frontTimes("Abc", 3) → "AbcAbcAbc"
 */

fun main() {
    println(frontTimes("Chocolate", 2))
    println(frontTimes("Chocolate", 3))
    println(frontTimes("Abc", 3))
}

fun frontTimes(str: String, num: Int): String {
    val res = StringBuilder()
    var front = ""
    if (str.length < 3) front = str else front = str.substring(0,3)
    repeat(num) {
        res.append(front)
    }
    return res.toString()
}