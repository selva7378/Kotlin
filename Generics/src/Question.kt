import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Stack

// enum class
enum class Difficulty {
    EASY, MEDIUM, HARD
}

// interface
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

// singleton companion object
class Quiz : ProgressPrintable {

    override val progressText: String
        get() = "${answered} of ${total} answered"

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // signleton inside a class
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

/* extension property
 * val Quiz.StudentProgress.progressText: String
 * get() = "${answered} of ${total} answered"
 */

/* extension function
 * fun Quiz.StudentProgress.printProgressBar() {
 *     repeat(Quiz.answered) { print("▓") }
 *     repeat(Quiz.total - Quiz.answered) { print("▒") }
 *     println()
 *     println(Quiz.progressText)
 * }
 */



// data class
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

// signleton object
object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}

fun main(args: Array<String>) {
    val quiz = Quiz().apply {
        printQuiz()
    }

    Quiz().apply {
        printQuiz()
    }

    // accessing properties of singleton object
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
    // accessing properties of singleton object reside in another class also called companion object.
    println("${Quiz.answered} of ${Quiz.total} answered.")
    Quiz().printProgressBar()
}

