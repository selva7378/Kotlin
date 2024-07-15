package warmup2

/*
 Given a non-empty string like "Code" return a string like "CCoCodCode".

 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */

fun main() {
    println(stringSplosion("Code"))
    println(stringSplosion("abc"))
    println(stringSplosion("ab"))
}

fun stringSplosion(str: String): String {
    val tempStr: StringBuilder = StringBuilder()
    for (i in 0..str.length) {
        tempStr.append(str.substring(0,i))
    }
    return tempStr.toString()
}