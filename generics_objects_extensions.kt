/*
    CodeLab: https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?hl=ja&continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-generics#0
 */

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Question<T>(
    val question: String,
    val answer: T,
    val difficulty: Difficulty
)

 fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}