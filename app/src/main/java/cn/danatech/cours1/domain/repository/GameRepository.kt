package cn.danatech.cours1.domain.repository

import cn.danatech.cours1.domain.entity.GameSettings
import cn.danatech.cours1.domain.entity.Level
import cn.danatech.cours1.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOption: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}