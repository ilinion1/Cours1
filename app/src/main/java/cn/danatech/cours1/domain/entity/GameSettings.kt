package cn.danatech.cours1.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRingAnswer: Int,
    val minPercentOfRingAnswer: Int,
    val gameTimeInSecond: Int
)
