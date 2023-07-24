package com.example.thecountsgame.domain.usecases

import com.example.thecountsgame.domain.entity.GameSettings
import com.example.thecountsgame.domain.entity.Level
import com.example.thecountsgame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}