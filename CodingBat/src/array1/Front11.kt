package array1

/*
 *Given 2 int arrays, a and b, of any length, return a new array
 *with the first element of each array. If either array is length 0, ignore that array.
 *
 *front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 *front11([1], [2]) → [1, 2]
 *front11([1, 7], []) → [1]
 */

fun main() {
    println(front11(arrayOf(1, 2, 3), arrayOf(7, 9, 8)).contentToString())
    println(front11(arrayOf(1), arrayOf(2)).contentToString())
    println(front11(arrayOf(1, 7), arrayOf()).contentToString())
}

fun front11(a: Array<Int>, b: Array<Int>): Array<Int> {
    if (a.size == 0) {
        return arrayOf(b[0])
    } else if (b.size == 0) {
        return arrayOf(a[0])
    }else if (a.size == 0 || b.size == 0){
        return arrayOf()
    }else {
        return arrayOf(a[0], b[0])
    }
}