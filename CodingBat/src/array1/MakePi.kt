package array1

/*
 *Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 *
 *makePi() → [3, 1, 4]
 */

fun main(){
    println(makePi().joinToString(",", "[", "]"))
}

fun makePi(): Array<Int> = arrayOf(3, 1, 4)