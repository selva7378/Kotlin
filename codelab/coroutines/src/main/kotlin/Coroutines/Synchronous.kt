import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    /* runBlocking() runs an event loop, which can handle multiple tasks at once by
     continuing each task where it left off when it's ready to be resumed.
     */
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            launch {
                printForecast()
            }
            launch {
                printTemperature()
            }
            delay(4000)
            println("selva")
        }
    }


    println("Execution time: ${time / 1000.0} seconds")
}

suspend fun printForecast() {
    delay(2000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}