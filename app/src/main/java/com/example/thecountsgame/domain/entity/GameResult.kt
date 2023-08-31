package com.example.thecountsgame.domain.entity

import java.io.Serializable

data class GameResult (
    val winner: Boolean,
    val countOfRightsAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
) : Serializable