package warmup1

fun main(args: Array<String>){

}

fun parrotTrouble(talking: Boolean, hour: Int): Boolean =
    if(talking && (hour < 7 || hour > 20)) true else false