/*
    Codelab: https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections#1
 */

 data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
 )

 enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
 }

 fun main() {
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    // return type will be Map<Daypart, List<Event>>
    val eventsByDaypart = events.groupBy { it.daypart }
    eventsByDaypart.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
 }