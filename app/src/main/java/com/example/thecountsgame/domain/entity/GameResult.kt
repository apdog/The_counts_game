package com.example.thecountsgame.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult (
    val winner: Boolean,
    val countOfRightsAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
) : Parcelable