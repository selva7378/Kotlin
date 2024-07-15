package string1

/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */

fun main() {
    println(helloName("Bob"))
    println(helloName("Alice"))
    println(helloName("X"))
}


fun helloName(name: String): String = "Hello $name!"
