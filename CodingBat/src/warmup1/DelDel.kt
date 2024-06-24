package warmup1

/*
 *Given a string, if the string "del" appears starting at index 1,
 *return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 *
 *delDel("adelbc") → "abc"
 *delDel("adelHello") → "aHello"
 *delDel("adedbc") → "adedbc"
 */
fun main() {
    println(delDel("adelbc"))
    println(delDel("adelHello"))
    println(delDel("adedbc"))
}

fun delDel(str: String): String =
    if (str.length < 4) str
    else if (str.substring(1, 4).equals("del")) str[0] + str.substring(4)
    else str

