


fun main(args: Array<String>) {
    val rockPlanets = arrayOf<String>("Mercury", "venus", "earth", "mars")
    val gasPlanets = arrayOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")

//    one dimensional array
    val arr = Array<Int>(5) {0}
    println(arr.size)

//    two-dimensional array
    val arr2d = Array(5) { Array(4) {0} }
    println(arr2d.size)
    println(arr2d[0].size)

    val solarSystem = rockPlanets + gasPlanets

    for (planets in solarSystem) {
        println(planets)
    }
    for (number in arr) {
        print("$number ")
    }
}