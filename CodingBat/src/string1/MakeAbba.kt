package string1

/*
 Given two strings, a and b, return the result of putting them together in the order abba,
  e.g. "Hi" and "Bye" returns "HiByeByeHi".

 makeAbba("Hi", "Bye") → "HiByeByeHi"
 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 makeAbba("What", "Up") → "WhatUpUpWhat"
 */

fun main() {
    println(makeAbba("Hi", "Bye"))
    println(makeAbba("Yo", "Alice"))
    println(makeAbba("What", "Up"))
}

fun makeAbba(a: String, b: String): String = "$a$b$b$a"