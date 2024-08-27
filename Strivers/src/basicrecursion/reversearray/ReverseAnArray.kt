package basicrecursion.reversearray

import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {
    println("INPUTREVERSE ARRAY")
    inputReverseArray()
    println("HARDCODE REVERSE ARRAY")
    hardCodeReverseArray()
    println("RANDOM REVERSE ARRAY")
    randomReverseArray()
}

fun inputReverseArray() {
    val sc = Scanner(System.`in`);
    print("Enter array size :")
    val arrSize = sc.nextInt()
    val arr = Array<Int>(arrSize) {0}
    for (i in 0 until arrSize) {
        arr[i] = sc.nextInt()
    }
    println(arr.contentToString())
    reverseArray(arr, 0, arr.size - 1)
    println(arr.contentToString())
}

fun hardCodeReverseArray() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    println(arr.contentToString())
    reverseArray(arr, 0, arr.size - 1)
    println(arr.contentToString())
}

fun randomReverseArray(){
    val rand = Random()
    val arrSize = rand.nextInt(5)
    val arr = Array<Int>(arrSize){0}
    println("array size is $arrSize")
    for (i in 0 until arrSize) {
        arr[i] = rand.nextInt(5)
    }
    println(arr.contentToString())
    reverseArray(arr, 0, arr.size - 1)
    println(arr.contentToString())
}

fun reverseArray(arr: Array<Int>, start: Int, end: Int) {
    if (start >= end) return
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
    reverseArray(arr, start + 1, end - 1)
}