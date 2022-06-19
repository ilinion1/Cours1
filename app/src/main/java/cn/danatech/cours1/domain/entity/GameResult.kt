package cn.danatech.cours1.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfRingAnswer: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
)