/*
    Codelab: https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections#1
 */

 data class Event(
    val title: String,
    val description: String?,
    val dayPart: DayPart,
    val duration: Int
 )

 enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING
 }

 fun main() {
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        dayPart = DayPart.EVENING,
        duration = 15
    )
    println(event)
 }