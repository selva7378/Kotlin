package array1

/*
 *Given 2 int arrays, a and b, return a new array length 2 containing,
 *as much as will fit, the elements from a followed by the elements from b.
 *The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
 *
 *make2([4, 5], [1, 2, 3]) → [4, 5]
 *make2([4], [1, 2, 3]) → [4, 1]
 *make2([], [1, 2]) → [1, 2]
 */

fun main() {
    println(make2(arrayOf(4, 5), arrayOf(1, 2, 3)).contentToString())
    println(make2(arrayOf(4), arrayOf(1, 2, 3)).contentToString())
    println(make2(arrayOf(), arrayOf(1,2)).contentToString())
}

fun make2(a: Array<Int>, b: Array<Int>): Array<Int> {
    val arr = Array<Int>(2) {0}
    if (b.size == 0){
        arr[0] = a[0]
        arr[1] = a[1]
        return arr
    }

    if (a.size == 0){
        arr[0] = b[0]
        arr[1] = b[1]
        return arr
    }

    if (a.size == 1){
        arr[0] = a[0]
        arr[1] = b[0]
        return arr
    }

    arr[0] = a[0]
    arr[1] = a[1]
    return arr
}