

fun main(args: Array<String>) {
//    planet's and number of moons
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println("size = ${solarSystem.size}")
    solarSystem["Pluto"]  = 5
    println("size = ${solarSystem.size}")

    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))

    solarSystem.remove("Pluto")
    println("size = ${solarSystem.size}")

    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])

}