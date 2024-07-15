package practice

class SongCatalog(val title: String, val artist: String, val yearPublished: Int, var playCount: Int) {

    val isPopular: Boolean
        get() = playCount >= 1000

    fun songDescription() {
        println(isPopular)
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main(args: Array<String>) {
    val dangerous: SongCatalog = SongCatalog("dangerous", "michael jackson", 1919, 5)
    dangerous.songDescription()
    println(dangerous.isPopular)
    dangerous.playCount = 1001
    dangerous.songDescription()
    println(dangerous.isPopular)

}