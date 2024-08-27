package kotlinPractice.recursion

// Palindrome check using Recursion

fun main() {
    val a = arrayOf("abbcbba", "abba", "geeks")
    println(isPalindrome(a[0], 0, a[0].length-1) )
    println(isPalindrome(a[1], 0, a[1].length-1) )
    println(isPalindrome(a[2], 0, a[2].length-1) )
}

fun isPalindrome(str: String, start: Int, end: Int): Boolean {
    if (start > end) {
        return true
    }else{
        return (str[start] == str[end] && isPalindrome(str, start + 1, end - 1))
    }
}