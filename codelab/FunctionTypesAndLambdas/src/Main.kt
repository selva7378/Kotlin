

fun main() {

    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    trickFunction()

    repeat(4) {
        treatFunction()
    }
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if(isTrick){
        return trick
    }else{
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick: () -> Unit = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

fun demo(number: Int): String {
    return "selva ganesh"
}