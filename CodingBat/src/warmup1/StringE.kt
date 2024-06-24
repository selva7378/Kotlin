package warmup1

/*
 *Return true if the given string contains between 1 and 3 'e' chars.
 *
 *stringE("Hello") → true
 *stringE("Heelle") → true
 *stringE("Heelele") → false
 */

fun main() {
    println(stringE("Hello"))
    println(stringE("Heelle"))
    println(stringE("Heelele"))
}

fun stringE(str: String): Boolean {
    var count: Int = 0
    for(char in str){
        if(char == 'e') count++
    }
    return count in 1..3
}