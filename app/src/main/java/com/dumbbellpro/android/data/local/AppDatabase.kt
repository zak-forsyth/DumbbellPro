package com.dumbbellpro.android.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dumbbellpro.android.data.model.*

@Database(
    entities = [
        Exercise::class,
        Workout::class,
        WorkoutExercise::class,
        ExerciseSet::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun workoutDao(): WorkoutDao
    abstract fun exerciseSetDao(): ExerciseSetDao
}