/*
    Codelab: https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-collections#1
 */


 fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem.get(2))
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.contains("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }

    val solarSystemMutable = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystemMutable.add("Pluto")
    solarSystemMutable.add(3, "Theia")
    solarSystemMutable[3] = "Future Moon"
    println(solarSystemMutable[3])
    println(solarSystemMutable[9])
    solarSystemMutable.removeAt(9)
    solarSystemMutable.remove("Future Moon")
    println(solarSystemMutable.contains("Pluto"))
    println("Future Moon" in solarSystemMutable)
 }
