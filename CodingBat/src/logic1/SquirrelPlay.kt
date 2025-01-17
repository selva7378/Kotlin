package logic1

/*
 *The squirrels in Palo Alto spend most of the day playing.
 *In particular, they play if the temperature is between 60 and 90 (inclusive).
 *Unless it is summer, then the upper limit is 100 instead of 90. Given an int
 *temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 *
 *squirrelPlay(70, false) → true
 *squirrelPlay(95, false) → false
 *squirrelPlay(95, true) → true
 */

fun main() {
    println(squirrelPlay(70, false))
    println(squirrelPlay(95, false))
    println(squirrelPlay(95, true))
}

fun squirrelPlay(temp: Int, isSummer: Boolean): Boolean =
    if (isSummer) temp in 60..100
    else temp in 60..90