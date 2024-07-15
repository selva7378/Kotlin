package array2

/*
 *Given a number n, create and return a new string array of length n,
 *containing the strings "0", "1" "2" .. through n-1. N may be 0, in
 *which case just return a length 0 array. Note: String.valueOf(xxx)
 *will make the String form of most types. The syntax to make a new
 *string array is: new String[desired_length]  (See also: FizzBuzz Code)
 *
 *
 *fizzArray2(4) → ["0", "1", "2", "3"]
 *fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
 *fizzArray2(2) → ["0", "1"]
 */

fun main() {
    println(fizzArray(4).contentToString())
    println(fizzArray(10).contentToString())
    println(fizzArray(2).contentToString())
}

fun fizzArray2(n: Int): Array<String> {
    var arr = Array<String>(0) {"0"}
    for (i in 0 until arr.size){
        arr[i] = i.toString()
    }
    return arr
}