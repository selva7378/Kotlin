package string3

/*
 *Given a string, return the length of the largest "block" in the string.
 *A block is a run of adjacent chars that are the same.
 *
 *
 *maxBlock("hoopla") → 2
 *maxBlock("abbCCCddBBBxx") → 3
 *maxBlock("") → 0
 */

fun main() {
    println(maxBlock("hoopla"))
    println(maxBlock("abbCCCddBBBxx"))
    println(maxBlock(""))

    println()

    println(maxBlockUsingMap("hoopla"))
    println(maxBlockUsingMap("abbCCCddBBBxx"))
    println(maxBlockUsingMap(""))
}

fun maxBlock(str: String): Int {
    if(str.length == 0) return 0;
    var maxBlock = 0
    var blockCount = 1
    for (i in 0..str.length - 2) {
        if (str[i] == str[i + 1]) {
            blockCount++
        } else {
            if (blockCount > maxBlock) {
                maxBlock = blockCount
            }
            blockCount = 1
        }
    }
    return if (maxBlock > blockCount) maxBlock else blockCount
}

fun maxBlockUsingMap(str: String): Int {
    var map = mutableMapOf<Char, Int>()
    var maxBlock = 0
    for (char in str) {
        map[char] = map.getOrDefault(char, 0) + 1
        if (map.getOrDefault(char, 0) > maxBlock) {
            maxBlock = map.get(char)!!
        }
    }
    return maxBlock
}