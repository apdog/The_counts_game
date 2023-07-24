package com.example.thecountsgame.domain.repository

import com.example.thecountsgame.domain.entity.GameSettings
import com.example.thecountsgame.domain.entity.Level
import com.example.thecountsgame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}