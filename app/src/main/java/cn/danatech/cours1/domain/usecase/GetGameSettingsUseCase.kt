package cn.danatech.cours1.domain.usecase

import cn.danatech.cours1.domain.entity.GameSettings
import cn.danatech.cours1.domain.entity.Level
import cn.danatech.cours1.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}