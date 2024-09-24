/*
    CodeLab: https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?hl=ja&continue=https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1?hl%3Dja%23codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-generics#0
 */

 // Step1: Create a class hierarchy
 // questionTextとdifficulyをもつ親クラスを作って継承しても、毎回型が違うだけのanswerを作るのは面倒

 class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
 )

 class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
 )

 class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
 )

 // Step2: Use generics

 class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
 )


 fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
}