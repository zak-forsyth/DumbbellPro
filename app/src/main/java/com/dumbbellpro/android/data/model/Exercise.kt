package com.dumbbellpro.android.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Duration

@Entity(tableName = "exercises")
data class Exercise(
    @PrimaryKey val id: String,
    val name: String,
    val description: String,
    val targetMuscles: List<String>,
    val equipment: List<String>,
    val defaultSets: Int,
    val defaultReps: Int,
    val defaultRestTime: Duration,
    val thumbnailUrl: String?,
    val difficulty: String
)