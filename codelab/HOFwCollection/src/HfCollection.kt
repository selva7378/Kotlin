//Higher-order functions with collections

data class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main(args: Array<String>) {
    forEachAndStringTemplatesWithLambdas()
    map()
    filter()
    groupBy()
    fold()
}

fun forEachAndStringTemplatesWithLambdas() {
    cookies.forEach {
        println("Menu item: $it")
    }
    println()


    cookies.forEach {
        // lambdas in string templates
        println("Menu item: ${it.name}")
    }
}

fun map() {
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    println()
    println("Full Menu")
    fullMenu.forEach {
        println(it)
    }
}

fun filter() {
    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    println()
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}

fun groupBy() {
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }

//  Note: Alternatively, emptyList() creates an empty list and may be more readable.
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println()
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    println()
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
//    Note: If you only need to split a list in two, an alternative is the partition() function.
}

fun fold() {
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }

    println()
    println("Total price: $${totalPrice}")
}

fun sortBy() {
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}