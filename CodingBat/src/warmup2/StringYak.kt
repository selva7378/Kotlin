package warmup2

/*
 *Suppose the string "yak" is unlucky. Given a string,
 *return a version where all the "yak" are removed,
 *but the "a" can be any char. The "yak" strings will not overlap.
 *
 *stringYak("yakpak") → "pak"
 *stringYak("pakyak") → "pak"
 *stringYak("yak123ya") → "123ya"
 *
 * stringYak("yak") → ""
 * stringYak("yakxxxyak") → "xxx"
 * stringYak("HiyakHi") → "HiHi"
 * stringYak("xxxyakyyyakzzz") → "xxxyyzzz"
 */
fun main() {
    println(stringYak("yakpak"))
    println(stringYak("pakyak"))
    println(stringYak("yak123ya"))
    println(stringYak("yak"))
    println(stringYak("yakxxxyak"))
    println(stringYak("HiyakHi"))
    println(stringYak("xxxyakyyyakzzz"))
}

fun stringYak(str: String): String {
    var res: StringBuilder = StringBuilder()
    if (str.length < 3) return str
    else {
        var i = 0
        while (i < str.length) {
            if (i + 2 >= str.length) {
                res.append(str.substring(i))
                break
            } else if (str[i] != 'y' || str[i + 2] != 'k') {
                res.append(str[i])
                i++
                continue
            }
            i = i + 3
        }
    }
    return res.toString()
}