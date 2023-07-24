package com.example.thecountsgame.domain.entity

data class GameResult (
    val winner: Boolean,
    val countOfRightsAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
)