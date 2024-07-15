data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

val Event.durationOfEvent: String
    get() = if (durationInMinutes < 60) "short" else "long"

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

val event1 = Event(
    "Study Kotlin",
    "Commit to studying Kotlin at least 15 minutes per day.",
    Daypart.AFTERNOON,
    15
)

fun main(args: Array<String>) {
    val events: List<Event> = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 70),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )
    println(event1)

    println(
        "You have ${
            events.filter {
                it.durationInMinutes < 60
            }.size
        } short events"
    )

    println()
    println("summary of all the events and their daypart.")
    events.groupBy {
        it.daypart
    }.forEach {
        println("${it.key}: ${it.value.size}")
    }

    println("Last event of the day: ${events.last().title}")

    println("Duration of first event of the day: ${events[0].durationOfEvent}")


}