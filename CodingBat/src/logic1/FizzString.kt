package logic1

/*
 *Given a string str, if the string starts with "f" return "Fizz".
 *If the string ends with "b" return "Buzz". If both the "f" and "b"
 *conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 *
 *fizzString("fig") → "Fizz"
 *fizzString("dib") → "Buzz"
 *fizzString("fib") → "FizzBuzz"
 */

fun main() {
    println(fizzString("fig"))
    println(fizzString("dib"))
    println(fizzString("fib"))
    println(fizzString(""))
}

fun fizzString(str: String): String =
    if (str.startsWith("f") && str.endsWith("b")) "FizzBuzz"
    else if (str.startsWith("f")) "Fizz"
    else if (str.endsWith("b")) "Buzz"
    else str