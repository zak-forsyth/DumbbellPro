package com.dumbbellpro.android.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.time.DayOfWeek
import java.time.Instant

@Entity(tableName = "workouts")
data class Workout(
    @PrimaryKey val id: String,
    val name: String,
    val dayOfWeek: DayOfWeek,
    val targetMuscleGroups: List<String>,
    val createdAt: Instant,
    val updatedAt: Instant
)

data class WorkoutWithExercises(
    @Relation(
        parentColumn = "id",
        entityColumn = "workoutId"
    )
    val workout: Workout,
    val exercises: List<ExerciseWithSets>
)