

fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem[0])
    println(solarSystem.get(0))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        print("$planet, ")
    }
    println()

    mutableSolarSystem.add("Pluto")
    mutableSolarSystem.add(3, "Theia")
    for (planet in mutableSolarSystem) {
        print("$planet, ")
    }
    println()

    mutableSolarSystem[3] = "Future moon"
    println(mutableSolarSystem[3])
    println(mutableSolarSystem[9])
    mutableSolarSystem.removeAt(9)
    println(mutableSolarSystem.remove("Future Moon"))

    println(mutableSolarSystem.contains("Pluto"))
    println("Future moon" in mutableSolarSystem)
}