package warmup2

/*
 *Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 *stringBits("Hello") → "Hlo"
 *stringBits("Hi") → "H"
 *stringBits("Heeololeo") → "Hello"
 */

fun main() {
    println(stringBits("Hello"))
    println(stringBits("Hi"))
    println(stringBits("Heeololeo"))
}

fun stringBits(str: String): String {
    val tempStr: StringBuilder = StringBuilder()
    for (i in 0..str.length-1 step 2) {
        tempStr.append(str[i])
    }
    return tempStr.toString()
}