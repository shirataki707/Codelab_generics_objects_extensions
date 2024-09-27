/*
    Codelab: https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-collections#1
 */


 fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 88,
        "Venus" to 225,
        "Earth" to 365,
        "Mars" to 687,
        "Jupiter" to 4333,
        "Saturn" to 10759,
        "Uranus" to 30687,
        "Neptune" to 60190
    )
    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    solarSystem["Jupiter"] = 4332
    println(solarSystem["Jupiter"])
 }
