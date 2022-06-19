package cn.danatech.cours1.data.repository

import android.text.style.QuoteSpan
import cn.danatech.cours1.domain.entity.GameSettings
import cn.danatech.cours1.domain.entity.Level
import cn.danatech.cours1.domain.entity.Question
import cn.danatech.cours1.domain.repository.GameRepository
import kotlin.math.max
import kotlin.math.min

object GameRepositoryImpl : GameRepository {

    private const val MIN_SUM_VALUE = 2
    private const val MIN_VISIBLE_NUMBER = 1


    override fun generateQuestion(maxSumValue: Int, countOption: Int): Question {
        val sum = (MIN_SUM_VALUE..maxSumValue).random()
        val visibleNumber = (MIN_VISIBLE_NUMBER until sum).random()
        val option = HashSet<Int>()
        val ringAnswer = sum - visibleNumber
        option.add(ringAnswer)
        val from = max(ringAnswer - countOption, MIN_VISIBLE_NUMBER)
        val to = min(maxSumValue - 1, ringAnswer + countOption)
        while (option.size < countOption) {
            option.add((from..to).random())
        }
        return Question(sum, visibleNumber, option.toList())
    }

    override fun getGameSettings(level: Level): GameSettings {
        return when (level) {
            Level.TEST -> {
                GameSettings(
                    10,
                    3,
                    50,
                    8
                )
            }
            Level.EASY -> {
                GameSettings(
                    15,
                    5,
                    50,
                    30
                )
            }
            Level.NORMAL -> {
                GameSettings(
                    20,
                    6,
                    66,
                    30
                )
            }
            Level.HARD -> {
                GameSettings(
                    30,
                    7,
                    60,
                    30
                )
            }
        }
    }

}