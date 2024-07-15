package warmup2

/*
 *Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *
 *altPairs("kitten") → "kien"
 *altPairs("Chocolate") → "Chole"
 *altPairs("CodingHorror") → "Congrr"
 */

fun main() {
    println(altPairs("kitten"))
    println(altPairs("Chocolate"))
    println(altPairs("CodingHorror"))
}

fun altPairs(str: String): String {
    var res: StringBuilder = StringBuilder()
    var i = 0
    while (i < str.length) {
        var end = i + 2
        if (end > str.length) end = str.length
        res.append(str.substring(i, end))
        i = i + 4
    }
    return res.toString()
}