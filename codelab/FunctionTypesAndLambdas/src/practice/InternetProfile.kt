package practice

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {

    fun showProfile() {
        if(referrer == null){
            println("Name: $name \nAge: $age \nLikes to play $hobby. Doesn't have a referrer.")
        } else {
            println("Name: $name \nAge: $age \nLikes to play $hobby. Has a referrer named ${referrer.name}, who likes to play ${referrer.hobby}.")
        }
    }
}

fun main(args: Array<String>){
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}