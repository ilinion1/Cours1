package cn.danatech.cours1.domain.usecase

import cn.danatech.cours1.domain.entity.Question
import cn.danatech.cours1.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question{
       return repository.generateQuestion(maxSumValue, COUNT_OF_OPTION)
    }

    companion object{
        const val COUNT_OF_OPTION = 6
    }
}