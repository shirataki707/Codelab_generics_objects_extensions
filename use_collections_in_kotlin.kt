/*
    Codelab: https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-collections#1
 */


 fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets

    solarSystem[3] = "Little Earth"

    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(solarSystem[8])
 }
